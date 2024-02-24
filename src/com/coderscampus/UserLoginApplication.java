package com.coderscampus;

import java.io.IOException;
import java.util.Scanner;


public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User[] newuser;
		try{
			newuser = userService.getUsers("data.txt");
		}catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
			return;
	}
		
			try (Scanner scanner = new Scanner(System.in)) {
				int attemption = 0;
				while (attemption < 5) {
					System.out.println("Enter Username: ");
					String inputUsername = scanner.nextLine();
					System.out.println("Enter Password: ");
					String inputPassword = scanner.nextLine();
					
					User toconfirm = userService.userValidation(newuser, inputUsername, inputPassword);
					if (toconfirm != null) {
						System.out.println("Welcome " + toconfirm.getName());
						break;
					}else {
						attemption++;
						System.out.println("Invalid login, please try again: ");
					}
				}
				if(attemption == 5) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				}
			
			}
			
			
		}

}


