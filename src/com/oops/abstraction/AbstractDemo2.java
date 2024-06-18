package com.oops.abstraction;


public class AbstractDemo2 extends AbstractDemo1{

	
	public void phone() {
		System.out.println("phone method of abstract demo");
		
	}
	
	public static void main(String[] args) {
		
		
		AbstractDemo2 ab = new AbstractDemo2();
		ab.phone();
		ab.nonAbs();
	}

}
