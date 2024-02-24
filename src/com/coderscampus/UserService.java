package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	
	public User[] getUsers(String fileName) throws IOException {
		
			BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
		
			String line;
			int LineNumber = 0; 
			
			
			User[] newuser = new User[4];
			
			while ((line = fileReader.readLine()) != null){
				String[] data = line.split(",");
				newuser[LineNumber++] = new User(data[0], data[1], data[2]);
			}
		
			fileReader.close();
			return newuser;
			
	}	
	//Validating method name: userValidation 
	public User userValidation(User[]newuser,String inputEmail, String inputPassword) {
		
		for (User user : newuser) {
			if((user.getUsername()).equalsIgnoreCase(inputEmail) && (user.getPassword().equals(inputPassword))) {
				return user;
			}
		}
		return null;
	}
}
