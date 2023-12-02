package smqa.group17.smts.view;

import java.util.Scanner;

import smqa.group17.smts.controller.LoginController;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
        	System.out.println();
            System.out.println("Welcome to the Stock Market Trading System");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	System.out.println();
                    login(scanner);
//                    choice = 3;
                    break;
                case 2:
                	System.out.println();
                    register(scanner);
                    break;
                case 3:
                	System.out.println();
                    System.out.println("Exiting... Thank you for using the Stock Market Trading System.");
                    break;
                default:
                	System.out.println();
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
	}
	
	private static void login(Scanner scanner) {
        System.out.println("Login:");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        boolean isAlreadyRegistered = LoginController.isAlreadyRegistered(username);
        
        if(isAlreadyRegistered)
        {
        	boolean isAuthenticated = LoginController.login(username, password);
            if(isAuthenticated)
            {
            	new Dashboard(username, scanner);
            }
            else
            {
            	System.out.println("Invalid login details");
            }
        }
        else
        {
        	System.out.println("Please register first");
        }
    }

    private static void register(Scanner scanner) {
        System.out.println("Register:");
        System.out.print("Enter new username: ");
        String newUsername = scanner.next();
        
        boolean isAlreadyRegistered = LoginController.isAlreadyRegistered(newUsername);

        if (isAlreadyRegistered) {
            System.out.println("Username already exists. Please choose another username.");
        } else {
            System.out.print("Enter new password: ");
            String newPassword = scanner.next();
            
            LoginController.register(newUsername, newPassword);
            System.out.println("Registration successful! You can now login with the new credentials.");
        }
    }

}
