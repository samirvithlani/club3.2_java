package com.lambda;

@FunctionalInterface
interface Mappable{
	
	public void map();
}

@FunctionalInterface

interface Chargable{
	
	public int charge(int power);
}



public class LambdaDemo {

	
	public static void main(String[] args) {
		
		
		
		Mappable m = ()->{
			
			System.out.println("map mmethod called..");
		};
		m.map();
		
		
		
		Chargable c = (power)->{
			return power * 1000;
		};
		
		//Chargable c = c->c%2==0;
		System.out.println(c.charge(100));
		
		
	}
}
