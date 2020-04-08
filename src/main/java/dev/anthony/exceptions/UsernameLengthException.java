package dev.anthony.exceptions;

public class UsernameLengthException extends Exception{
   public UsernameLengthException() {
	   super();
	   System.out.println("the user name must be 6 digits");
   }
}
