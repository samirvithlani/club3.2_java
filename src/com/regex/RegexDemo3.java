package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		//Pattern pattern = Pattern.compile("^Hello(\\s){1,}(\\w)+"); //[A-Za-z0-9_]+
		//Pattern pattern = Pattern.compile("(\\w)*world$");
		Pattern pattern = Pattern.compile("^Hello(\\s){1}world$");
		Matcher m = pattern.matcher("Hello world");
		//.com //len min 8
		System.out.println(m.matches());
	}
}
