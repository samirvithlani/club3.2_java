package com.oops.abstraction;

//1.8
interface Water{
	//void x();
	default void demo() {
		System.out.println("default...");
	}
	static void demo2() {
		System.out.println("");
	}
}


public class Bottle implements Water{

	
	public static void main(String[] args) {
		
		
		Water w = new Bottle();
		w.demo();
		Water.demo2();
		
	}
	
}

class Bucket implements Water{
	
	
}