package com.oops.abstraction;
//c-c --> ex
//c-->i -->im
//i -->i -->ex
interface Earth{
	
	void water();
	
}
interface World extends Earth
{
	
	
}

abstract class Country implements World{
	
	
	public void water() {
		System.out.println("country water...");	
	}
}


public class City extends Country {

	//public void water() {};
}
