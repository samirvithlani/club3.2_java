package com.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

class Mobile{
	
	int id;
	String name;
	public Mobile(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	
}

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		
//		TreeSet<String> ts = new TreeSet<String>();
//		ts.add("zara");
//		ts.add("amit");
//		ts.add("sumit");
//		
//		for(String s:ts) {
//			System.out.println(s);
//		}
		
//		TreeSet<Mobile> ts = new TreeSet<Mobile>();
//		ts.add(new Mobile(191, "iphone"));
		
		
		HashSet<Mobile> hs = new HashSet<Mobile>();
		hs.add(new Mobile(101, "123"));
		
		
		
	}
}
