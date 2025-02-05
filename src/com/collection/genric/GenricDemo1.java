package com.collection.genric;

class Box<T>{
	
	public void test(T a) {
		
		System.out.println("a = "+a);
	}
	
}
class Bottle<T extends Number>{
	
	public void water(T a) {
		System.out.println("value of a = "+a);
	}
}

public class GenricDemo1 {

	
	public void demo(int x) {
		System.out.println("x = "+x);
	}
	
	
	public static void main(String[] args) {
		
		
		GenricDemo1 g1= new GenricDemo1();
		g1.demo(100);
		
		
		Box<String> b1 = new Box<String>();
		b1.test("ok");
		Box<Integer> b2 = new Box<Integer>();
		b2.test(190);
		
		
		//Bottle<String> bt1 = new Bottle<String>();
		//Bottle<Integer> bt1 = new Bottle<Integer>();
		//Bottle<Float> bt1 = new Bottle<Float>();
		
	}
}
