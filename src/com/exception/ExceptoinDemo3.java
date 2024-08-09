package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptoinDemo3 {

	public static void main(String[] args) {
		
		
		//try resource..
		try(FileReader reader = new FileReader("")){
			
			
			
		}catch (IOException e) {
			
			
		}
		
		
//		Scanner sc  = new Scanner(System.in);
//		
//		System.out.println("enter no");
//		int no1 = sc.nextInt();
//		
//		sc.close();
//		System.out.println(sc);
//		
		
		
		try(Scanner sc  = new Scanner(System.in)){
			
			System.out.println("no2");
			int no1 = sc.nextInt();
			
		}
		catch (Exception e) {
			
			
		}
			// TODO: handle exception
		
		
		
		
		
	}
}
