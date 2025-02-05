package com.collection.genric;

public class GenricDemo2 {

	public <T> void myDemo(T a) {

		System.out.println("a = " + a);
		// return a;
	}

	public <T> T myDemo1(T a) {

		System.out.println("a = " + a);
		//
		return a;
	}

	public static void main(String[] args) {

		GenricDemo2 g2 = new GenricDemo2();
		g2.myDemo(100);
		g2.myDemo("ok");
		g2.myDemo(false);
		g2.myDemo(new Object());

	}
}
