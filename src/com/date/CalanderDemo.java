package com.date;

import java.util.Calendar;

public class CalanderDemo {

	
	public static void main(String[] args) {
		
		
		Calendar c =Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MILLISECOND));
		System.out.println(c.get(Calendar.MINUTE));  
		
		
		
		
		
	}
}
