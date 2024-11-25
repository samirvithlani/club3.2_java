package com.rev.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		String name= "ram";
		System.out.println("enter index to accedd");
		int index = sc.nextInt();
		
		System.out.println(name.charAt(index));
		}catch(InputMismatchException | StringIndexOutOfBoundsException  e) {
			
			System.out.println("check your input..");
		}
		finally {
			System.out.println("finally..");
		}
		
	}
}
