package com.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {

//		String str = "ram";
//		str= str.concat(" Seeta");
//		System.out.println(str);
		
		StringBuffer sbr = new StringBuffer("ram");
		System.out.println(sbr);
		
		sbr.append(" seeta");
		System.out.println(sbr);
		
		char c = sbr.charAt(1);
		System.out.println(c);
		
		sbr.delete(1, 3); //1st and 2nd delete
		System.out.println(sbr);
		
		sbr.insert(1, "am");
		System.out.println(sbr);
		
		//0 1 2 3
		sbr.replace(0, 4, "#");
		System.out.println(sbr);
		
		sbr.reverse();
		System.out.println(sbr);
		
		sbr.deleteCharAt(4);
		System.out.println(sbr);
		
		
		
		
		

	}
}
