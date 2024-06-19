package com.oops.abstraction;

interface Run {

	void runnbale();

}

public class Running implements Run {
	
	public void test() {
		
		System.out.println("test...");
	}

	public static void main(String[] args) {

		//run time polymorephisam | polymorphic object
		//refer = Object | memory
		Run r = new Running();
		r.runnbale();
		
		Running r1 = new Running();
		r1.runnbale();
		
		
		
	}

	public void runnbale() {

		System.out.println("Run method called....");

	}
}
