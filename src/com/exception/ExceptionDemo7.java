package com.exception;

import java.util.Scanner;

import com.enums.InvalidDataException;

public class ExceptionDemo7 {

	public static void main(String[] args) throws InvalidDataException,InvalidAgeException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name");
		String str = sc.next();
		
		if(str.length()<5) {
			
		//	throw new InvalidStringException("length must be greater 5");
			throw new InvalidDataException("");
		}
		
		
		
	}
}
