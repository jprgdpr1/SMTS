package smqa.group17.smts.tests.whitebox;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import smqa.group17.smts.controller.DashboardController;
import smqa.group17.smts.controller.DecryptionController;
import smqa.group17.smts.controller.EncryptionController;
import smqa.group17.smts.controller.LoginController;
import smqa.group17.smts.model.Order;
import smqa.group17.smts.model.Stock;
import smqa.group17.smts.model.User;
import smqa.group17.smts.view.Portfolio;
import smqa.group17.smts.view.ViewStocks;
import smqa.group17.smts.view.WishList;

class WhiteBoxTests {
	
	//Testing adding CL stock to a user's wishlist
	@Test
	void addStockToWishlistTest1() {
		String stockSymbol = "CL";
		String username = "jpr";
		String response = DashboardController.addStockToWishlist(stockSymbol, username);
		Assertions.assertEquals(stockSymbol + " added to wishlist of user " + username, response);
	}
	
	//Testing adding MSFT to a user's wishlist
	@Test
	void addStockToWishlistTest2()
	{
		String stockSymbol = "MSFT";
		String username = "abcde";
		String response = DashboardController.addStockToWishlist(stockSymbol, username);
		Assertions.assertEquals(stockSymbol + " added to wishlist of user " + username, response);
	}
	
	//Testing whether getAllStocks() is returning all stocks from the db
	@Test
	void getAllStocksTest()
	{
		List<Stock> stockList = DashboardController.getAllStocks();
		Assertions.assertEquals(49, stockList.size());
	}
	
	//Testing whether getUserDataForUserId() is returning correct data for user jpr
	@Test
	void getUserDataForUserIdTest1()
	{
		User user = DashboardController.getUserDataForUserId("jpr");
		Assertions.assertEquals("jpr", user.getUserName());
		Assertions.assertEquals("XJb7lSvnV7pHo9PuS76W5g==", user.getPassword());
	}
	
	//Testing whether getUserDataForUserId() is returning correct data for user abcde
	@Test
	void getUserDataForUserIdTest2()
	{
		User user = DashboardController.getUserDataForUserId("abcde");
		Assertions.assertEquals("abcde", user.getUserName());
		Assertions.assertEquals("0KnBG2Rdy5mh/DNh9hNkKQ==", user.getPassword());
	}
	
	//Testing updateFundsForUser() updates funds row in DB for user jpr
	@Test
	void updateFundsForUserTest1()
	{
		DashboardController.updateFundsForUser("jpr", 10000.00);
		User user = DashboardController.getUserDataForUserId("jpr");
		Assertions.assertEquals(10000.00, user.getFunds());
	}
	
	//Testing updateFundsForUser() updates funds row in DB for user abcde
	@Test
	void updateFundsForUserTest2()
	{
		DashboardController.updateFundsForUser("abcde", 3000.00);
		User user = DashboardController.getUserDataForUserId("abcde");
		Assertions.assertEquals(3000.00, user.getFunds());
	}
	
	//Testing withdrawFunds() method for user jpr success scenario
	@Test
	void withdrawFundsTest1()
	{
		String username = "jpr";
		double inputFunds = 2.00;
		String response = DashboardController.withdrawFunds(username, inputFunds);
		Assertions.assertEquals("Funds Withdrawn", response);
	}
	
	//Testing withdrawFunds() method for user jpr success scenario
	@Test
	void withdrawFundsTest2()
	{
		String username = "jpr";
		double inputFunds = 10000000.00;
		String response = DashboardController.withdrawFunds(username, inputFunds);
		Assertions.assertEquals("You do not have enough Fund balance to withdraw GBP " + inputFunds, response);
	}
	
	//Testing buyStock with username jpr, new stock in portfolio and 2 shares
	@Test
	void buyStockTest1()
	{
		String username = "jpr";
		String stockSymbol = "FB";
		int numberOfShares = 2;
		String response = DashboardController.buyStock(username, stockSymbol, numberOfShares);
		Assertions.assertEquals(numberOfShares + " shares of " + stockSymbol + " has been added to your Portfolio", response);
	}
	
	//Testing buyStock with username jpr, existing stock in portfolio and 2 shares
	@Test
	void buyStockTest2()
	{
		String username = "jpr";
		String stockSymbol = "FB";
		int numberOfShares = 2;
		String response = DashboardController.buyStock(username, stockSymbol, numberOfShares);
		Assertions.assertEquals(numberOfShares + " shares of " + stockSymbol + " has been added to your Portfolio", response);
	}
	
		
	//Testing buyStock with username jpr, existing stock in portfolio but more than balance amount
	@Test
	void buyStockTest3()
	{
		String username = "jpr";
		String stockSymbol = "AMZN";
		int numberOfShares = 1000;
		String response = DashboardController.buyStock(username, stockSymbol, numberOfShares);
		Assertions.assertEquals("You do not have enough balance to complete this buy " + numberOfShares + " shares of stock " + stockSymbol + ")", response);
	}
	
	//Testing calculateProfitLoss for profit
	@Test
	void calculateProfitLossTest1()
	{
		double response = DashboardController.calculateProfitLoss(150.00, 300.00);
		Assertions.assertEquals(100.00, response);
	}
	
	//Testing calculateProfitLoss for profit
	@Test
	void calculateProfitLossTest2()
	{
		double response = DashboardController.calculateProfitLoss(300.00, 150.00);
		Assertions.assertEquals(-50.00, response);
	}
	
	//Testing getAverage
	@Test
	void getAverageTest1()
	{
		double response = DashboardController.getAverage(20.00, 30.00);
		Assertions.assertEquals(25.00, response);
	}
	
	//Testing getAverage
	@Test
	void getAverageTest2()
	{
		double response = DashboardController.getAverage(40.00, 50.00);
		Assertions.assertEquals(45.00, response);
	}
	
	//Testing generateRandom6CharacterID
	@Test
	void generateRandom6CharacterIDTest1()
	{
		String response = DashboardController.generateRandom6CharacterID();
		Assertions.assertEquals(6, response.length());
	}
	
	//Testing getAllOrdersForUserName
	@Test
	void getAllOrdersForUserName()
	{
		String username = "jpr";
		List<Order> orderList = DashboardController.getAllOrdersForUserName(username);
		Assertions.assertEquals("jpr", orderList.get(0).getUserName());
	}
	
	//Testing sellStock for username jpr and stock PG and no of shares less than no of shares in portfolio
	@Test
	void sellStockTest1()
	{
		String username = "jpr";
		String stockToSell = "FB";
		int numberOfShares = 1;
		String response = DashboardController.sellStock(username, stockToSell, numberOfShares);
		Assertions.assertEquals(stockToSell+ " has been sold successfully", response);
	}
	
	//Testing sellStock for username jpr and stock PG and no of shares more than no of shares in portfolio
	@Test
	void sellStockTest2()
	{
		String username = "jpr";
		String stockToSell = "FB";
		int numberOfShares = 40;
		String response = DashboardController.sellStock(username, stockToSell, numberOfShares);
	}
		
	
	//Testing sellStock for username jpr and stock PG and no of shares equal to no of shares in portfolio
	@Test
	void sellStockTest3()
	{
		String username = "jpr";
		String stockToSell = "FB";
		int numberOfShares = 3;
		String response = DashboardController.sellStock(username, stockToSell, numberOfShares);
		Assertions.assertEquals(stockToSell+ " has been sold successfully", response);
	}
			
	//Testing sellStock for username jpr and stock AMZN which is not in portfolio
	@Test
	void sellStockTest4()
	{
		String username = "jpr";
		String stockToSell = "AMZN";
		int numberOfShares = 10;
		String response = DashboardController.sellStock(username, stockToSell, numberOfShares);
		Assertions.assertEquals("You do not own any " + stockToSell + " shares.", response);
	}
	
	//Testing getAllStocksInWishlist
	@Test
	void getAllStocksInWishlistTest1()
	{
		String username = "jpr";
		DashboardController.getAllStocksInWishlist(username);
	}
	
	//Testing changeStockPrices
	@Test
	void changeStockPricesTest()
	{
		String response = DashboardController.changeStockPrices();
		Assertions.assertEquals("Stock Prices changed", response);
	}
	
	//Testing encryption for jpr
	@Test
	void encryptTest1()
	{
		String input = "jpr";
		String response = EncryptionController.encrypt(input);
		Assertions.assertEquals("XJb7lSvnV7pHo9PuS76W5g==", response);
	}
	
	//Testing encryption for abcde
	@Test
	void encryptTest2()
	{
		String input = "abcde";
		String response = EncryptionController.encrypt(input);
		Assertions.assertEquals("0KnBG2Rdy5mh/DNh9hNkKQ==", response);
	}
	
	//Testing decryption for jpr
	@Test
	void decryptTest1()
	{
		String input = "XJb7lSvnV7pHo9PuS76W5g==";
		String response = DecryptionController.decrypt(input);
		Assertions.assertEquals("jpr", response);
	}
	
	//Testing decryption for abcde
	@Test
	void decryptTest2()
	{
		String input = "0KnBG2Rdy5mh/DNh9hNkKQ==";
		String response = DecryptionController.decrypt(input);
		Assertions.assertEquals("abcde", response);
	}
	
	//Testing isAlreadyRegistered for jpr
	@Test
	void isAlreadyRegisteredTest1() throws Exception
	{
		String username = "jpr";
		boolean response = LoginController.isAlreadyRegistered(username);
		Assertions.assertEquals(true, response);
	}
	
	//Testing isAlreadyRegistered for jprgdpr1
	@Test
	void isAlreadyRegisteredTest2() throws Exception
	{
		String username = "jprgdpr1";
		boolean response = LoginController.isAlreadyRegistered(username);
		Assertions.assertEquals(false, response);
	}
	
	//Testing login with correct credentials
	@Test
	void loginTest1()
	{
		String username = "jpr";
		String password = "jpr";
		boolean response = LoginController.login(username, password);
		Assertions.assertEquals(true, response);
	}
	
	//Testing login with correct credentials
	@Test
	void loginTest2()
	{
		String username = "jpr";
		String password = "abcde";
		boolean response = LoginController.login(username, password);
		Assertions.assertEquals(false, response);
	}
	
	//Testing 
	@Test
	void registerTest()
	{
		String username = DashboardController.generateRandom6CharacterID();
		String password = "abcde";
		String response = LoginController.register(username, password);
		Assertions.assertEquals("Registration Successfull", response);
	}
	
	//Testing all the Views
	@Test
	void portfolioTest()
	{
		new Portfolio("jpr", new Scanner(System.in));
	}
	
	@Test
	void viewStocksTest()
	{
		new ViewStocks("jpr", new Scanner(System.in));
	}

	@Test
	void WishListTest()
	{
		new WishList("jpr", new Scanner(System.in));
	}
}
