package dev.anthony.exceptions;

public class UsernameValidator {
      
	public boolean validateUsername(String s) throws UsernameLengthException, UsernameInvalidCharacterException{
		if(s.length()<6) {
			throw new UsernameLengthException();
		}
		if(s.contains("$")) {
			throw new UsernameInvalidCharacterException("$");
			
		}
		if(s.contains("#")) {
			throw new UsernameInvalidCharacterException("#");
			
		}

	return false;
}
}