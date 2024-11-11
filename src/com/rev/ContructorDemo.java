package com.rev;

public class ContructorDemo {

	//contructor is special function which has same name as class name.
	//use of constructor is to inilize object of class, and instance vari
	//type of , default, param const, copy const..
	
	//class level variable....
	int x;
	
	
	public ContructorDemo() {
		
		System.out.println("default const...");
		x =100;
	}
	
	public static void main(String[] args) {
		
		
		ContructorDemo c1 = new ContructorDemo(); //default
	
	}
}
