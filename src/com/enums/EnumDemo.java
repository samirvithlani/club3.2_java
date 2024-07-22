package com.enums;

enum Color{
	
	//final static
	red,green,blue
}

public class EnumDemo {

	enum Days{
		Monday,
		Tuesday,
		Wendesday,
		Thursday,
		Friday,
		Saturday,
		Sunday
	}
	//enum objects will store as array
	
	public static void main(String[] args) {
		
		Color c1 = Color.red;
		System.out.println(c1);
		System.out.println(Color.blue);
		
		System.out.println(Days.Monday);
		
		
		for(Days d:Days.values()) {
			
			System.out.println(d);
		}
	}
	
}
