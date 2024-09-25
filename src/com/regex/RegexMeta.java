package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMeta {

	
	public static void main(String[] args) {
		
		// . :- any char
		//Pattern pattern = Pattern.compile("\\d+"); // \d [0-9]
		//Pattern pattern = Pattern.compile("\\D"); // \D [^0-9]
		//Pattern pattern = Pattern.compile("\\w"); // /w [a-zA-Z0-9_]
		//Pattern pattern = Pattern.compile("\\W"); // W any non word char
		//Pattern pattern = Pattern.compile("\\s"); // \s any white space char
		Pattern pattern = Pattern.compile("\\S"); // /S no white space
		Matcher m = pattern.matcher("a");
		System.out.println(m.matches());
		
	}
}
