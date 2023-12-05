package smqa.group17.smts.services;

public class DAOService {
  public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new PortfolioPerformanceChecker(), 0, 60000);
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(StockMarketSystem::checkMaintenanceSchedule, 0, 1, TimeUnit.HOURS);
        scheduler.scheduleAtFixedRate(StockMarketSystem::checkStockAlerts, 0, 1, TimeUnit.MINUTES);
  }
    
  static class PortfolioPerformanceChecker extends TimerTask {
      public void run() {
          checkPortfolioPerformance();
      }
  }

  public static void checkMaintenanceSchedule() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            LocalDateTime currentDateTime = LocalDateTime.now();
            String query = "SELECT * FROM maintenance_schedule WHERE start_time > ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setObject(1, currentDateTime);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maintenanceMessage = resultSet.getString("message");
                LocalDateTime startTime = resultSet.getObject("start_time", LocalDateTime.class);
                long timeUntilMaintenance = java.time.Duration.between(currentDateTime, startTime).toHours();
                System.out.println("Maintenance Notification:");
                System.out.println("Scheduled Maintenance in " + timeUntilMaintenance + " hours.");
                System.out.println("Message: " + maintenanceMessage);
                System.out.println("------------------------------");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
      }
  }
  
  public static void displayAvailableStocks() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT * FROM stocks";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Stocks available:");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("symbol") + "\t\t\t" + resultSet.getDouble("price"));
                String stockSymbol = resultSet.getString("symbol");
                String companyName = resultSet.getString("company_name");
                double stockPrice = resultSet.getDouble("price");
                System.out.println("Symbol: " + stockSymbol);
                System.out.println("Company Name: " + companyName);
                System.out.println("Price: $" + stockPrice);
                System.out.println("------------------------------");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static void checkStockAlerts() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            LocalDateTime currentDateTime = LocalDateTime.now();
            String query = "SELECT * FROM stock_alerts WHERE alert_time <= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setObject(1, currentDateTime);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String stockSymbol = resultSet.getString("stock_symbol");
                double targetPrice = resultSet.getDouble("target_price");
                LocalDateTime alertTime = resultSet.getObject("alert_time", LocalDateTime.class);
                double currentStockPrice = getStockPrice(stockSymbol);
                if (currentStockPrice >= targetPrice) {
                    System.out.println("Alert for user " + userId + ":");
                    System.out.println("Stock Symbol: " + stockSymbol);
                    System.out.println("Target Price: $" + targetPrice);
                    System.out.println("Current Stock Price: $" + currentStockPrice);
                    System.out.println("Alert Time: " + alertTime);
                    System.out.println("------------------------------");
                }
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
  private static double getStockPrice(String stockSymbol) {
      return Math.random() * 100;
  }

  public static void checkPortfolioPerformance() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT user_id, stock_symbol, quantity, purchase_price FROM portfolios";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                String stockSymbol = resultSet.getString("stock_symbol");
                int quantity = resultSet.getInt("quantity");
                double purchasePrice = resultSet.getDouble("purchase_price");
                double currentStockPrice = getStockPrice(stockSymbol);
                double currentPortfolioValue = quantity * currentStockPrice;
                double percentageChange = ((currentPortfolioValue - purchasePrice) / purchasePrice) * 100;
                if (Math.abs(percentageChange) >= 10.0) {
                    System.out.println("Alert: Significant change in portfolio performance for user " + userId);
                    System.out.println("Current Portfolio Value: $" + currentPortfolioValue);
                    System.out.println("Percentage Change: " + percentageChange + "%");
                    System.out.println("------------------------------");
                }
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  private static double getStockPrice(String stockSymbol) {
      return Math.random() * 100; 
  }
  
  public static void addToWishList() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter stock symbol:");
            String stockSymbol = scanner.nextLine();
            System.out.println("Enter company name:");
            String companyName = scanner.nextLine();
            System.out.println("Enter stock price:");
            double stockPrice = scanner.nextDouble();
            String query = "INSERT INTO wishlist (user_id, stock_symbol, company_name, price) VALUES (?, ?, ?, ?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            int userId = 1;
            preparedStatement.setInt(1, userId);
            preparedStatement.setString(2, stockSymbol);
            preparedStatement.setString(3, companyName);
            preparedStatement.setDouble(4, stockPrice);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Stock added to wishlist successfully!");
            } else {
                System.out.println("Failed to add stock to wishlist.");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
  private static double getAvailableFunds(Connection connection, int userId) throws SQLException {
        String query = "SELECT available_funds FROM users WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, userId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getDouble("available_funds");
                }
            }
        }
    
        return 0.0; // Default if user not found or other error
    }

  private static double getStockPrice(Connection connection, String stockSymbol) throws SQLException {
        String query = "SELECT price FROM stocks WHERE symbol = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, stockSymbol);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getDouble("price");
                }
            }
        }
        return 0.0; // Default if stock not found or other error
    }

  private static void performStockPurchase(Connection connection, int userId, String stockSymbol,
                                             int quantity, double totalPrice) throws SQLException {
        // Deduct funds from user's account
        String deductFundsQuery = "UPDATE users SET available_funds = available_funds - ? WHERE id = ?";
        try (PreparedStatement deductFundsStatement = connection.prepareStatement(deductFundsQuery)) {
            deductFundsStatement.setDouble(1, totalPrice);
            deductFundsStatement.setInt(2, userId);
            deductFundsStatement.executeUpdate();
        }
        // Add stocks to user's portfolio
        String addStocksQuery = "INSERT INTO user_stocks (user_id, stock_symbol, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement addStocksStatement = connection.prepareStatement(addStocksQuery)) {
            addStocksStatement.setInt(1, userId);
            addStocksStatement.setString(2, stockSymbol);
            addStocksStatement.setInt(3, quantity);
            addStocksStatement.executeUpdate();
        }
    }
    public void generateReports() {
        generateUserActivityReport();
        generateSystemPerformanceReport();
    }
    private void generateUserActivityReport() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Replace 'your_user_activity_table' with the actual name of your user activity table
            String userActivityQuery = "SELECT user_id, activity_type, timestamp FROM your_user_activity_table";
            try (PreparedStatement preparedStatement = connection.prepareStatement(userActivityQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    System.out.println("User Activity Report:");
                    while (resultSet.next()) {
                        int userId = resultSet.getInt("user_id");
                        String activityType = resultSet.getString("activity_type");
                        String timestamp = resultSet.getString("timestamp");
                        System.out.println("User ID: " + userId + ", Activity Type: " + activityType + ", Timestamp: " + timestamp);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void generateSystemPerformanceReport() {
        // Implement system performance report generation logic here
        // You can collect data such as CPU usage, memory usage, etc. and print or log the report
        System.out.println("System Performance Report: (Implement your logic here)");
    }
}
public List<String> searchStocks(String category, double minPrice, double maxPrice) {
        List<String> matchingStocks = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // You need to replace 'your_stock_table' with the actual name of your stock table
            String query = "SELECT stock_symbol FROM your_stock_table WHERE category = ? AND price BETWEEN ? AND ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, category);
                preparedStatement.setDouble(2, minPrice);
                preparedStatement.setDouble(3, maxPrice);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String stockSymbol = resultSet.getString("stock_symbol");
                        matchingStocks.add(stockSymbol);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return matchingStocks;
    }
    public List<String> getWishList(int userId) {
        List<String> wishList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT stock_symbol FROM wishlist WHERE user_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, userId);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String stockSymbol = resultSet.getString("stock_symbol");
                        wishList.add(stockSymbol);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wishList;
    }
    public void registerNewAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Registration ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (userAccounts.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Save the new user account
        userAccounts.put(username, password);

        System.out.println("Registration successful! Welcome, " + username + "!");
    }
}
 public void registerNewAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Registration ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (userAccounts.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Save the new user account
        userAccounts.put(username, password);

        System.out.println("Registration successful! Welcome, " + username + "!");
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Login ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username exists
        if (!userAccounts.containsKey(username)) {
            System.out.println("Username does not exist. Please register first.");
            return;
        }

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Check if the entered password matches the stored password for the username
        if (enteredPassword.equals(userAccounts.get(username))) {
            // Generate a session token (replace with a more secure approach)
            String sessionToken = generateSessionToken();
            loggedInUsers.put(username, sessionToken);

            System.out.println("Login successful! Welcome, " + username + "!");
            System.out.println("Your session token is: " + sessionToken);
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    }

    private String generateSessionToken() {
        // Replace with a more secure session token generation approach in a real application
        return "sample_session_token";
    }
}
public void updateAccountInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Update Account Information ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if the username exists
        if (!userAccounts.containsKey(username)) {
            System.out.println("Username does not exist. Please register first.");
            return;
        }

        // Check if the user is logged in (replace with a more secure session management approach)
        if (!loggedInUsers.containsKey(username)) {
            System.out.println("Please log in first to update your account information.");
            return;
        }

        User user = userAccounts.get(username);

        System.out.println("Current Account Information:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail()); // Replace with actual user properties

        System.out.print("Enter new email (or press Enter to keep the current one): ");
        String newEmail = scanner.nextLine();

        // Update email if a new one is provided
        if (!newEmail.isEmpty()) {
            user.setEmail(newEmail);
            System.out.println("Email updated successfully.");
        }

        // You can add more fields to update as needed (e.g., password, security settings, etc.)

        System.out.println("Account information updated successfully.");
    }

    private String generateSessionToken() {
        // ... (same as previous example)
    }

    // Placeholder User class for storing user information
    private static class User {
        private String username;
        private String email;

        public User(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
}
