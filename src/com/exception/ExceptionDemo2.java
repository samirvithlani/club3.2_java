package com.exception;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	
	public static void main(String[] args) {
		
		
		Scanner sc   =new Scanner(System.in);
		
		try {
			System.out.println("enter no1 ");
		int no1 = sc.nextInt();
		System.out.println("enter no2 ");
		int no2 = sc.nextInt();
		
		int ans = no1 / no2;
//		File file = new File("");
//		file.createNewFile();
		
		}catch (ArithmeticException | InputMismatchException   e) {
			
			System.out.println("please check your input..");
		}
		
		
		
	}
}
