package com.oops.inheritance;

//child / derived/ sub class can use prop of parent / base / class this 
//process called inheritance...
//type of inheritance in java
/*
 * 1)single a -->b
 * 2)multilevel a -->b=-->c
 * 3)multipule a --b,c
 * 4)hybride 
 * 5)hyricical
 * 
 * */

class Parent{
	
	int x=100;
	static int y;
	public void test() {
		
		System.out.println("non static test method from parent class....");
	}
}
public class InheritanceDemo1 extends Parent {
	
	
	public void demo() {
		
		test();
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		System.out.println(y);
		
	}
}
