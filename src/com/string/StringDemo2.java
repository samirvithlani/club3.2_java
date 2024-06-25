package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String data = "India";
		System.out.println("startsWith "+ data.startsWith("I"));
		System.out.println("Ends with "+data.endsWith("a"));
		System.out.println(data.equals("india"));
		System.out.println(data.equalsIgnoreCase("india"));
		System.out.println(data.contains("di"));
		System.out.println(data.isEmpty());
		
	};

}
