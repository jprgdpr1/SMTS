package smqa.group17.smts.controller;

import java.security.SecureRandom;
import java.util.List;

import smqa.group17.smts.model.Order;
import smqa.group17.smts.model.Stock;
import smqa.group17.smts.model.User;

public class DashboardController {

	public static void addStockToWishlist(String stockSymbol, String username) {
		// TODO Auto-generated method stub
		DatabaseController.addStockToWishListForUser(stockSymbol, username);
	}

	public static List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		return DatabaseController.getAllStocks();
	}

	public static User getUserDataForUserId(String username) {
		// TODO Auto-generated method stub
		return DatabaseController.getUserDataForUsernamme(username);
		
	}

	public static void updateFundsForUser(String username, double newFunds) {
		// TODO Auto-generated method stub
		DatabaseController.updateFundsForUser(username, newFunds);
	}

	public static void withdrawFunds(String username, double inputFund) {
		// TODO Auto-generated method stub
		User user = DashboardController.getUserDataForUserId(username);
		if(inputFund > user.getFunds())
        	System.out.println("You do not have enough Fund balance to withdraw GBP " + inputFund);
        else
        {
        	double newFunds = user.getFunds() - inputFund;
        	DashboardController.updateFundsForUser(username, newFunds);
        	System.out.println("Your new Fund Balance: " + newFunds);
        }
	}

	public static void buyStock(String username, String stockSymbol, int numberOfShares) {
		// TODO Auto-generated method stub
		User user = DashboardController.getUserDataForUserId(username);
		Stock stockToBuy = DatabaseController.getStockDataForSymbol(stockSymbol);
		
		double fundsRequiredToBuy = stockToBuy.getPrice() * numberOfShares;
		
		if(user.getFunds() > fundsRequiredToBuy)
		{
			boolean stockAlreadyInPortfolio = DatabaseController.checkIfStockAlreadyInPortfolio(username, stockSymbol);
			if(stockAlreadyInPortfolio)
			{
				Order existingOrder = DatabaseController.getOrderDetails(username, stockSymbol);
				String userName = username;
				String stocksymbol = stockSymbol;
				int newNumberOfShares = existingOrder.getNumberOfShares() + numberOfShares;
				double newBuyPrice = getAverage(existingOrder.getBuyPrice(), stockToBuy.getPrice());
				double newCurrentPrice = getAverage(existingOrder.getCurrentPrice(), stockToBuy.getPrice());
				double pnl = calculateProfitLoss(newBuyPrice, newCurrentPrice);
				DatabaseController.updateOrder(userName, stocksymbol, newNumberOfShares, newBuyPrice, newCurrentPrice, pnl);
				System.out.println(numberOfShares + " shares of " + stockSymbol + " has been added to your Portfolio");
				
			}
			else
			{
				String orderID = generateRandom6CharacterID();
				String userName = username;
				String stocksymbol = stockSymbol;
				int numberofshares = numberOfShares;
				double buyPrice = stockToBuy.getPrice();
				double currentPrice = buyPrice;
				double pnl = 0;
				DatabaseController.addStockToProtfolio(orderID, userName, stocksymbol, numberofshares, buyPrice, currentPrice, pnl);
				System.out.println(numberOfShares + " shares of " + stockSymbol + " has been added to your Portfolio");
			}

			//Update user details
			User currentUser = DatabaseController.getUserDataForUsernamme(username);
			double newInvested = currentUser.getInvested() + fundsRequiredToBuy;
			double newCurrentAmount = currentUser.getCurrentAmount() + fundsRequiredToBuy;
			double newFunds = currentUser.getFunds() - fundsRequiredToBuy;
			double newPNL = calculateProfitLoss(newInvested, newCurrentAmount);
			DatabaseController.updateUserPnL(username, newInvested, newCurrentAmount, newFunds, newPNL);
		}
		else
		{
			System.out.println("You do not have enough balance to complete this buy " + numberOfShares + " shares of stock " + stockSymbol + "("+ stockToBuy.getName() +")");
		}
	}

	private static double calculateProfitLoss(double buyPrice, double currentPrice) {
		// TODO Auto-generated method stub
		double profitLossPercentage = ((currentPrice - buyPrice) / buyPrice) * 100;
        return profitLossPercentage;
	}

	private static double getAverage(double value1, double value2) {
		// TODO Auto-generated method stub
		return (value1 + value2)/2;
	}

	private static String generateRandom6CharacterID() {
		// TODO Auto-generated method stub
		final String ALPHABET = "0123456789";
	    final SecureRandom random = new SecureRandom();
		StringBuilder stringBuilder = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(ALPHABET.length());
            char randomChar = ALPHABET.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
	}

	public static List<Order> getAllOrdersForUserName(String username) {
		// TODO Auto-generated method stub
		return DatabaseController.getAllOrdersForUserName(username);
	}

	public static void sellStock(String username, String stockToSell, int numberOfShares) {
		// TODO Auto-generated method stub
		List<Order> orderList = DatabaseController.getAllOrdersForUserName(username);
		boolean flag = true;
		for(Order order : orderList)
		{
			if(order.getStockSymbol().equalsIgnoreCase(stockToSell))
			{
				flag = false;
				if(numberOfShares == order.getNumberOfShares())
				{
					//delete from portfolio
					double investedAmount = order.getBuyPrice() * order.getNumberOfShares();
					double currentAmount = order.getCurrentPrice() * order.getNumberOfShares();
					
					DatabaseController.deleteStockFromPortfolio(username, stockToSell);
					
					//Update user details
					User user = DatabaseController.getUserDataForUsernamme(username);
					double newInvested = user.getInvested() + investedAmount;
					double newCurrent = user.getCurrentAmount() + currentAmount;
					double newFunds = user.getFunds() + currentAmount;
					double newPNL = calculateProfitLoss(newInvested, newCurrent);
					
					DatabaseController.updateUserPnL(username, newInvested, newCurrent, newFunds, newPNL);
				}
				else if(numberOfShares < order.getNumberOfShares())
				{
					//update portfolio
					double investedAmount = order.getBuyPrice() * order.getNumberOfShares();
					double currentAmount = order.getCurrentPrice() * order.getNumberOfShares();
					
					int numberOfSharesToUpdate = order.getNumberOfShares() - numberOfShares;
					DatabaseController.updateOrder(username, stockToSell, numberOfSharesToUpdate, order.getBuyPrice(), order.getCurrentPrice(), order.getPnl());
					
					//Update user details
					User user = DatabaseController.getUserDataForUsernamme(username);
					double newInvested = user.getInvested() + investedAmount;
					double newCurrent = user.getCurrentAmount() + currentAmount;
					double newFunds = user.getFunds() + currentAmount;
					double newPNL = calculateProfitLoss(newInvested, newCurrent);
					
					DatabaseController.updateUserPnL(username, newInvested, newCurrent, newFunds, newPNL);
				}
				else
					System.out.println("You only have " + order.getNumberOfShares() + " shares of " + stockToSell + " in your Portfolio");
			}
		}
		if(flag)
			System.out.println("You do not own any " + stockToSell + " shares.");
	}

	public static List<Stock> getAllStocksInWishlist(String username) {
		// TODO Auto-generated method stub
		return DatabaseController.getAllStocksInWishlist(username);
	}

	public static void changeStockPrices() {
		// TODO Auto-generated method stub
		//Update stock table
		DatabaseController.changeStockPrices();
	}

}
