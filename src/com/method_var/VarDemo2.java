package com.method_var;

public class VarDemo2 {

	//static variable...
	
	int balance; //3
	static int intRate;
	
	public static void main(String[] args) {
		
		
		VarDemo2 v1 = new VarDemo2();
		VarDemo2 v2 = new VarDemo2();
		VarDemo2 v3 = new VarDemo2();
		
		//System.out.println(/balance);
		v1.balance = 1000;
		v2.balance = 1200;
		v3.balance = 4500;
		//n copy will genrate for non static instance variable....
		
		System.out.println(v1.balance);
		System.out.println(v3.balance);
		
		intRate = 20;
		intRate = 40;
		System.out.println(intRate);
		//only one copy will genrate for static variable
		
		
	}
}
