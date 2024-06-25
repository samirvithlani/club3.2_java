package com.string;

public class StringDemo1 {

	
	public static void main(String[] args) {
		
		
		String name = "amit";
		System.out.println("name = "+name);
		//immutable...
		
		name = name.concat(" patel");
		System.out.println("name ="+name);
		
		name = name.toUpperCase();
		System.out.println("after upper.."+name);
		
		name = name.toLowerCase();
		System.out.println("lower case.."+name);
		
		//find len...
		int len  = name.length();
		System.out.println("len of string  = "+len);
		
		String email = "  raj@gmail@.com ";
		System.out.println("email len = "+email.length());
		email = email.trim();
		System.out.println("email len = "+email.length());
		
		
		int ind  = email.indexOf('@');
		System.out.println("index of "+ind);
		
		int lind = email.lastIndexOf('@');
		System.out.println("last index "+lind);
		
		ind = email.indexOf('@', 5);
		System.out.println("index of from char... "+ind);
		
		char c = email.charAt(3);
		System.out.println("c = "+c);
		
		
		
		
		
		
		
		
		
	}
}
