package com.rev;
/*
 *  param constructor...
 * 
 * */
public class Amazone {

	
	
	public Amazone(String country) {
		
		System.out.println("param const..."+country);
	}
	
	public static void main(String[] args) {
		
		
		
		//Amazone a = new Amazone(); //compile time error...
		Amazone a = new Amazone("IN");
		
	}
}
