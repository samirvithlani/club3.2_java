package com.oops.encapsulation.constructor;

class Lenovo {

	public Lenovo() {
		
		System.out.println("lenovo...");
	}

	public Lenovo(int price) {

		System.out.println("param......");
	}

}

public class Laptop extends Lenovo{

	
	public Laptop() {
		//super(1000000);
		System.out.println("laptop...");
	}
	
	public static void main(String[] args) {
		
		
		Laptop lp = new Laptop();
		
		
	}
}
