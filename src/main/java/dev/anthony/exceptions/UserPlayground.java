package dev.anthony.exceptions;

import java.util.Scanner;

public class UserPlayground {
	
	public static void main(String[] args) throws Exception {
		
		
		  Scanner scan = new Scanner(System.in);
		  UsernameValidator validator = new UsernameValidator();
		  
		  System.out.println("Pls Enter a new User name");
		  String username = scan.next();
		 
		  try {
			  validator.validateUsername(username);
		  }catch (UsernameLengthException e) {
			  
			  e.printStackTrace();
		  }catch (UsernameInvalidCharacterException e) {
			  e.printStackTrace();
		  }
		  
	}
	

}
