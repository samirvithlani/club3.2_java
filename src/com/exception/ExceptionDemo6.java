package com.exception;

//

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String str) {
		
		super(str);
	}
	
	
	
	
}
public class ExceptionDemo6 {
	
	
	public void checkAge(int age) throws InvalidAgeException {
		
		
		if(age<18) {
			
			throw new InvalidAgeException("age is not valid.");
		}
		
		
	}

	public static void main(String[] args) {
		
		
		ExceptionDemo6 e = new ExceptionDemo6();
		try {
			e.checkAge(17);
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			//System.out.println();
			System.out.println(e1.getMessage());
		}
		
		
	}
}
