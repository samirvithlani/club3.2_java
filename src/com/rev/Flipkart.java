package com.rev;
/*
 * 
 * constructor overloading...
 * 
 * */
public class Flipkart {

	public Flipkart() {
		
		System.out.println("default const...");
	}
	public Flipkart(String country) {
	
		System.out.println("flipkart in  "+ country);
	}
	public Flipkart(String country,int profit) {
		
		System.out.println("flipart making  profit amount "+profit+" in country "+country);
	}
	
	public static void main(String[] args) {
		
		Flipkart f = new Flipkart();
		Flipkart f1 = new Flipkart("India");
		Flipkart f2 = new Flipkart("India",120); 
		
	}
}
