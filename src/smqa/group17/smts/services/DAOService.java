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
  
}
