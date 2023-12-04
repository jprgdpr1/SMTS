package smqa.group17.smts.services;

public class DAOService {

  private static void displayAvailableStocks(Connection connection) throws SQLException {
        String query = "SELECT * FROM stocks";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            System.out.println("Available Stocks:");
            System.out.println("Stock Symbol\tStock Price");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("symbol") + "\t\t\t" + resultSet.getDouble("price"));
            }
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
  
}
