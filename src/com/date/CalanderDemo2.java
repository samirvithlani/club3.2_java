package com.date;

import java.util.Calendar;

public class CalanderDemo2 {

	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		c.add(Calendar.DATE, 1);
		System.out.println(c.getTime());
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		
		//find which day will be after 5 days :Monday
		
		
	}
}
