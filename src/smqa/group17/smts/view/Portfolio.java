package smqa.group17.smts.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import smqa.group17.smts.controller.DashboardController;
import smqa.group17.smts.controller.DatabaseController;
import smqa.group17.smts.model.Order;
import smqa.group17.smts.model.User;

public class Portfolio {

	public Portfolio(String username, Scanner scanner) {
		// TODO Auto-generated constructor stub
		DashboardController.changeStockPrices();
		
		List<Order> orderList = new ArrayList<Order>();
		
		orderList = DashboardController.getAllOrdersForUserName(username);
		
		System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-12s | %-15s | %-10s | %-13s | %-6s |\n",
                "Stock Symbol", "Number of Shares", "Buy Price", "Current Price", "PNL");
        System.out.println("--------------------------------------------------------------------------");

        for (Order order : orderList) {
            System.out.printf("| %-12s | %-15d | %-11f | %-13.2f | %-6.2f |\n",
                    order.getStockSymbol(), order.getNumberOfShares(), order.getBuyPrice(),
                    order.getCurrentPrice(), order.getPnl());
        }

        System.out.println("--------------------------------------------------------------------------");
        
        User currentUser = DatabaseController.getUserDataForUsernamme(username);
        System.out.println("Available Funds: " + currentUser.getFunds());
        System.out.println("Total Investment: " + currentUser.getInvested());
        System.out.println("Current Value of Investment: " + currentUser.getCurrentAmount());
        System.out.println("Profit/Loss: " + currentUser.getProfit());
	}

}
