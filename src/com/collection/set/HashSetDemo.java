package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("java");
		hashset.add("c");
		hashset.add("cpp");
		hashset.add("oop");
		hashset.add("python");
		hashset.add("go");
		hashset.add("go");
		
		
		
		
		for(String s:hashset) {
			System.out.println(s);
		}
		
		
		
	}
}
