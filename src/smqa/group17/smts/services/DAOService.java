package smqa.group17.smts.services;

public class DAOService {
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
}
