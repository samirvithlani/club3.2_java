package com.scanner;

import java.util.Scanner;
//import java.util.*;

public class ScannerDemo1 {

	public static void main(String[] args) {

		// Scanner class
		Scanner sc = new Scanner(System.in); // InputStream //java.io.InputStream
		// sc.close();
		// sc -->oBject of scanner class

		System.out.println("enter name :");
		// String name = sc.next();
		String name = sc.nextLine();
		System.out.println("Name = " + name);

		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("value of a = " + a);

		System.out.println("enter value of f");
		float f = sc.nextFloat();
		System.out.println("f = " + f);

		sc.close();

	}
}
