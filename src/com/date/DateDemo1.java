package com.date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		//Date date = new Date(0);
		//1900
		//Date date = new Date(105, 1, 14);
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getTime());
		long mils = date.getTime();
		System.out.println(mils);
		
		
		Date date2 = new Date(mils);
		System.out.println(date2);
		
		
	}
}
