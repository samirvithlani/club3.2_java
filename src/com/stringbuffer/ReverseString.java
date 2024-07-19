package com.stringbuffer;

public class ReverseString {

	public String rev(String str) {
		//parth

		//sbr
		StringBuffer sbr = new StringBuffer(str);
		//reverse htrap

		return sbr.reverse().toString();
		//sbr.toString();

	}

	public static void main(String[] args) {

		
		ReverseString rs = new ReverseString();
		String str1 = rs.rev("parth");
		System.out.println(str1);
		
	}
}
