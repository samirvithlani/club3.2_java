package com.enums;

enum Seasons{
	
	winter(10),summer(40),monsoon(20);
	
	int value;
	private Seasons(int value) {
		
		this.value = value;
	}
	
}

public class EnumDemo2 {

	public static void main(String[] args) {
		
		String choice = "winter";
		Seasons s1 = null;
		if(choice == "monsoon") {
			s1 = Seasons.monsoon;
		}
		else if(choice=="winter") {
			s1 = Seasons.winter;
		}
		
		System.out.println(Seasons.monsoon.value + " "+Seasons.monsoon);
		switch (s1) {
		case winter:
			System.out.println("this is winter season");
			break;
		case monsoon:
			System.out.println("this is monsoon season");
			break;

		default:
			break;
		}
		
		
		
		
		
	}
}
