package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	
	///patterns
	
	public static void main(String[] args) {
		
		//.
//		Pattern pattern = Pattern.compile("..s");
//		Matcher m = pattern.matcher("+-s");
		
//		Pattern pattern = Pattern.compile("[abc]"); //a,b,c
//		Matcher m = pattern.matcher("aa");
		
//		Pattern pattern = Pattern.compile("[a-z]"); //a,b,c
//		Matcher m = pattern.matcher("A");
		
//		Pattern pattern = Pattern.compile("[a-zA-Z]"); //a,b,c
//		Matcher m = pattern.matcher("1");
		
//		Pattern pattern = Pattern.compile("[a-zA-Z0-9_]"); //a,b,c
//		Matcher m = pattern.matcher("_");
//		Pattern pattern = Pattern.compile(".[a-zA-Z0-9_]"); //a,b,c
//		Matcher m = pattern.matcher("#_");
		
//		
		Pattern pattern = Pattern.compile("[^a-z][A-Z]"); //a,b,c
		Matcher m = pattern.matcher("PP");
		
		System.out.println(m.matches());
	}
}
