package com.rev;

class RBI{
	
	
	public RBI() {
		
		System.out.println("rbi class default const...");
	}
	
	
}

public class SBI extends RBI{

	public SBI() {
		
		System.out.println("sbi default const....");
	}
	
	public static void main(String[] args) {
		
		
		SBI s = new SBI();
		
		
	}
}
