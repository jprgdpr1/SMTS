package smqa.group17.smts.view;

import java.util.Scanner;

import smqa.group17.smts.controller.DashboardController;
import smqa.group17.smts.model.User;

public class WithdrawMoney {

	public WithdrawMoney(String username, Scanner scanner) {
		// TODO Auto-generated constructor stub
		User user = DashboardController.getUserDataForUserId(username);
		
		System.out.println("Current Funds Balance: " + user.getFunds());
		
		System.out.print("Please type in how much money you want to withdraw from your funds: ");
        double inputFund = scanner.nextDouble();
        
        DashboardController.withdrawFunds(username, inputFund);
	}

}
