package com.oops.abstraction;

public abstract class AbstractDemo1 {

	public abstract void phone();
	public void nonAbs() {
		System.out.println("non abs inside abs...");
	}
	
	public static void main(String[] args) {
		
		//abstract class obj can not be created...
		//AbstractDemo1 abs = new AbstractDemo1();
		
	}
}
