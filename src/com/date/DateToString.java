package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println(date);
		
		//DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		//DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//DateFormat df = new SimpleDateFormat("yyyy-MMM-dd");
		//DateFormat df = new SimpleDateFormat("yyyy-MMMM-dd");
		//DateFormat df = new SimpleDateFormat("yyyy/MMM/dd");
		//DateFormat df = new SimpleDateFormat("yyyy-MMM-dd HH");
		//DateFormat df = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
		//DateFormat df = new SimpleDateFormat("yyyy-MMM-dd HH::mm::ss a");
		//DateFormat df = new SimpleDateFormat("yyyy-MMM-dd HH::mm::ss a z");
		DateFormat df = new SimpleDateFormat("yyyy-MMM-dd HH::mm::ss a zzzz w EEEE");
		String strDate = df.format(date);
		System.out.println(strDate);
		
		
		
	}
}
