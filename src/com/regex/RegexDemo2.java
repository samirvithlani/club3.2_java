package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		
		
		//Pattern pattern = Pattern.compile(".+");
		//Pattern pattern = Pattern.compile("[abc]+"); //one and more
		//Pattern pattern = Pattern.compile("[a-zA-Z]+"); //one and more
		//Pattern pattern = Pattern.compile("[a-zA-Z]*"); //zerp and more
		//Pattern pattern = Pattern.compile("[a-zA-Z]?"); //one and more
		//Pattern pattern = Pattern.compile("[a-zA-Z]{0,3}"); //one and more
		Pattern pattern = Pattern.compile("[6-9]{1}[0-9]{9}"); //one and more
		Matcher m = pattern.matcher("9000000000");//zero and more...
		System.out.println(m.matches());
		
	}
}
