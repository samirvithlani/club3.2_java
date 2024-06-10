package com.oops.encapsulation.constructor;

public class Bank {
	
	int amount; //instance non static
	
	public Bank() {
		System.out.println("default constructor...");
		
		
	}
	
	public Bank(int amount) {
		//100
		
		System.out.println("Param constructor..");
		this.amount = amount;
	}
	
	
	public void getAmount() {
		
		System.out.println("amount  = "+amount);
	}
	
	
	public static void main(String[] args) {
		
		
		Bank b1 = new Bank(100);
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		Bank b4 = new Bank(400);
		Bank b5 = new Bank(500);
		b2.amount =200;
		b3.amount =300;
		
		
		b1.getAmount();
		b2.getAmount();
		b3.getAmount();
		b4.getAmount();
		b5.getAmount();
		
		
	}

}
