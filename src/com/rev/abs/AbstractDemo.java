package com.rev.abs;

//abstraction : -- data hiding...
//abstract class , interface.. 

abstract class Water{
	
	
	public abstract void makewater();
	
	public void bottle() {
		//not compulsory to override...
		System.out.println("bottle...");
	}
	
	
}

public class AbstractDemo extends Water {
	
	public void test() {
		System.out.println("test...");
	}

	
	public static void main(String[] args) {
		
		//we can not create obj of abstract class...
		//Water w = new Water(); error..
		//polymorephic object
		//parent class refereance and child class object | memory
		
		Water water = new AbstractDemo();
		water.makewater();
		//water.bottle();
		
		
	}
	
	public void makewater() {
		
		System.out.println("makewater of abstract demo....");
		
	}
}
