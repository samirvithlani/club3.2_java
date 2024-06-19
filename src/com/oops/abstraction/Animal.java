package com.oops.abstraction;

interface Dog{
	
	void bark();
	
}

interface Cat{
	
	void meow();
	
}


public class Animal implements Dog,Cat {

	public void food() {
		
		System.out.println("food...");
	}
	
	
	
	public void meow() {
		
		System.out.println("Meow.......");
		
	}

	
	public void bark() {
		
		System.out.println("Barking....");
		
	}
	
	public static void main(String[] args) {
		
		Dog d  = new Animal();
		d.bark();
		
		Cat c = new Animal();
		c.meow();
		
		
		
	}

}
