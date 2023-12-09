package smqa.group17.smts.controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import smqa.group17.smts.model.Order;
import smqa.group17.smts.model.Stock;
import smqa.group17.smts.model.User;

public class DatabaseController {
	
	// Database credentials
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/smts";
    private static final String USER = "jpr";
    private static final String PASS = "jprmysql";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

	public static boolean isAlreadyRegistered(String username) throws SQLException{
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		boolean exists = false;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String query = "SELECT COUNT(*) FROM users WHERE USER_NAME = ?";
            
        // Create a prepared statement
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);

        // Execute the query
        resultSet = preparedStatement.executeQuery();

        // If the query returns a result
        if (resultSet.next()) {
            // Get the count of occurrences of the username
            int count = resultSet.getInt(1);
            exists = count > 0; // Set exists to true if count > 0
        }
        return exists;
	}

	public static String getPasswordForUsername(String username) {
		Connection connection = getConnection();
		String password = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT password FROM users WHERE USER_NAME = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                password = resultSet.getString("PASSWORD");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return password;
	}

	public static void createUser(String newUsername, String newPassword) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;

        try {
            String query = "INSERT INTO users (USER_NAME, PASSWORD, INVESTED, CURRENT_AMOUNT, FUNDS) VALUES (?, ?, 0, 0, 0)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, newPassword);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
	}

	public static List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		List<Stock> stocks = new ArrayList<>();

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM stocks");

            while (resultSet.next()) {
                Stock stock = new Stock();
                stock.setSymbol(resultSet.getString("STOCK_SYMBOL"));
                stock.setName(resultSet.getString("STOCK_NAME"));
                stock.setPrice(resultSet.getDouble("STOCKS_PRICE"));
                stocks.add(stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stocks;
	}

	public static void addStockToWishListForUser(String stockSymbol, String username) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		
		String sql = "INSERT INTO wishlist (USER_NAME, STOCK_SYMBOL) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, stockSymbol);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public static User getUserDataForUsernamme(String username) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT * FROM users WHERE USER_NAME = ?";
        User user = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new User();
                user.setUserId(resultSet.getInt("USER_ID"));
                user.setUserName(resultSet.getString("USER_NAME"));
                user.setPassword(resultSet.getString("PASSWORD"));
                user.setInvested(resultSet.getDouble("INVESTED"));
                user.setCurrentAmount(resultSet.getDouble("CURRENT_AMOUNT"));
                user.setFunds(resultSet.getDouble("FUNDS"));
                user.setProfit(resultSet.getDouble("PROFIT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}

	public static void updateFundsForUser(String username, double newFunds) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "UPDATE users SET FUNDS = ? WHERE USER_NAME = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, newFunds);
            preparedStatement.setString(2, username);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public static Stock getStockDataForSymbol(String stockSymbol) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT * FROM stocks WHERE STOCK_SYMBOL = ?";
        Stock stock = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, stockSymbol);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                stock = new Stock();
                stock.setSymbol(resultSet.getString("STOCK_SYMBOL"));
                stock.setName(resultSet.getString("STOCK_NAME"));
                stock.setPrice(resultSet.getDouble("STOCKS_PRICE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stock;
	}

	public static void addStockToProtfolio(String orderID, String userName, String stocksymbol, int numberofshares,
			double buyPrice, double currentPrice, double pnl) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "INSERT INTO portfolio (ORDER_ID, USER_NAME, STOCK_SYMBOL, NUMBER_OF_SHARES, " +
                "BUY_PRICE, CURRENT_PRICE, PNL) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, orderID);
            preparedStatement.setString(2, userName);
            preparedStatement.setString(3, stocksymbol);
            preparedStatement.setInt(4, numberofshares);
            preparedStatement.setDouble(5, buyPrice);
            preparedStatement.setDouble(6, currentPrice);
            preparedStatement.setDouble(7, pnl);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception (e.g., log the error, throw custom exception)
        }
	}

	public static boolean checkIfStockAlreadyInPortfolio(String username, String stockSymbol) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT COUNT(*) AS count FROM portfolio WHERE USER_NAME = ? AND STOCK_SYMBOL = ?";
        boolean stockExists = false;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, stockSymbol);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int rowCount = resultSet.getInt("count");
                stockExists = rowCount > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stockExists;
	}

	public static Order getOrderDetails(String username, String stockSymbol) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT * FROM portfolio WHERE USER_NAME = ? AND STOCK_SYMBOL = ?";
        Order order = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, stockSymbol);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                order = new Order();
                order.setOrderID(resultSet.getInt("ORDER_ID"));
                order.setUserName(resultSet.getString("USER_NAME"));
                order.setStockSymbol(resultSet.getString("STOCK_SYMBOL"));
                order.setNumberOfShares(resultSet.getInt("NUMBER_OF_SHARES"));
                order.setBuyPrice(resultSet.getDouble("BUY_PRICE"));
                order.setCurrentPrice(resultSet.getDouble("CURRENT_PRICE"));
                order.setPnl(resultSet.getDouble("PNL"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return order;
	}

	public static void updateOrder(String userName, String stocksymbol, int newNumberOfShares, double newBuyPrice,
			double newCurrentPrice, double pnl) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "UPDATE portfolio SET NUMBER_OF_SHARES = ?, BUY_PRICE = ?, " +
                "CURRENT_PRICE = ?, PNL = ? WHERE USER_NAME = ? AND STOCK_SYMBOL = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, newNumberOfShares);
            preparedStatement.setDouble(2, newBuyPrice);
            preparedStatement.setDouble(3, newCurrentPrice);
            preparedStatement.setDouble(4, pnl);
            preparedStatement.setString(5, userName);
            preparedStatement.setString(6, stocksymbol);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public static List<Order> getAllOrdersForUserName(String username) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT * FROM portfolio WHERE USER_NAME = ?";
        List<Order> orders = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Order order = new Order();
                order.setOrderID(resultSet.getInt("ORDER_ID"));
                order.setUserName(resultSet.getString("USER_NAME"));
                order.setStockSymbol(resultSet.getString("STOCK_SYMBOL"));
                order.setNumberOfShares(resultSet.getInt("NUMBER_OF_SHARES"));
                order.setBuyPrice(resultSet.getDouble("BUY_PRICE"));
                order.setCurrentPrice(resultSet.getDouble("CURRENT_PRICE"));
                order.setPnl(resultSet.getDouble("PNL"));
                
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
	}

	public static void updateUserPnL(String username, double newInvested, double newCurrentAmount, double newFunds,
			double newPNL) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "UPDATE users SET INVESTED = ?, CURRENT_AMOUNT = ?, FUNDS = ?, PROFIT = ? " +
                "WHERE USER_NAME = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setDouble(1, newInvested);
            preparedStatement.setDouble(2, newCurrentAmount);
            preparedStatement.setDouble(3, newFunds);
            preparedStatement.setDouble(4, newPNL);
            preparedStatement.setString(5, username);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public static void deleteStockFromPortfolio(String username, String stockToSell) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "DELETE FROM portfolio WHERE USER_NAME = ? AND STOCK_SYMBOL = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, stockToSell);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	public static List<Stock> getAllStocksInWishlist(String username) {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT s.STOCK_ID, s.STOCK_SYMBOL, s.STOCK_NAME, s.STOCKS_PRICE " +
                "FROM stocks s INNER JOIN wishlist w ON s.STOCK_SYMBOL = w.STOCK_SYMBOL " +
                "WHERE w.USER_NAME = ?";
	   List<Stock> stocksInWishlist = new ArrayList<>();
	
	   try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	       preparedStatement.setString(1, username);
	       ResultSet resultSet = preparedStatement.executeQuery();
	
	       while (resultSet.next()) {
	           Stock stock = new Stock();
	           stock.setSymbol(resultSet.getString("STOCK_SYMBOL"));
	           stock.setName(resultSet.getString("STOCK_NAME"));
	           stock.setPrice(resultSet.getDouble("STOCKS_PRICE"));
	           
	           stocksInWishlist.add(stock);
	       }
	   } catch (SQLException e) {
	       e.printStackTrace();
	   }
	
	   return stocksInWishlist;
	}

	public static void changeStockPrices() {
		// TODO Auto-generated method stub
		Connection connection = getConnection();
		String sql = "SELECT STOCK_ID, STOCKS_PRICE FROM stocks";
        Random random = new Random();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql,
                ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                double currentPrice = resultSet.getDouble("STOCKS_PRICE");
                int stockID = resultSet.getInt("STOCK_ID");

                // Randomly increase or decrease the price by a random value between 1 to 5
                double randomChange = random.nextDouble() * 5; // Random value between 0 to 5
                boolean increasePrice = random.nextBoolean();

                if (increasePrice) {
                    currentPrice += randomChange;
                } else {
                    currentPrice -= randomChange;
                }
                
                currentPrice = Math.round(currentPrice * 100.0) / 100.0;
                // Update the STOCK_PRICE column in the ResultSet and then in the database
                resultSet.updateDouble("STOCKS_PRICE", currentPrice);
                resultSet.updateRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}
