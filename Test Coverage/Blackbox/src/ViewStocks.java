package smqa.group17.smts.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import smqa.group17.smts.controller.DashboardController;
import smqa.group17.smts.controller.DatabaseController;
import smqa.group17.smts.model.Stock;

public class ViewStocks {

	public ViewStocks(String username, Scanner scanner) {
		// TODO Auto-generated constructor stub
		DashboardController.changeStockPrices();
		
		List<Stock> stockList = new ArrayList<Stock>();
		stockList = DashboardController.getAllStocks();
		
		System.out.println("+--------------+--------------------------------------+------------+");
        System.out.println("| Stock Symbol | Stock Name                           | Stock Price|");
        System.out.println("+--------------+--------------------------------------+------------+");

        for (Stock stock : stockList) {
            System.out.printf("| %-12s | %-36s | %-10.2f |\n",
                    stock.getSymbol(),
                    stock.getName(),
                    stock.getPrice());
        }

        System.out.println("+--------------+--------------------------------------+------------+");
	}

}
