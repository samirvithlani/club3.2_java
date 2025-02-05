package com.collection.genric;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo3 {

	//wildcard entry,,
	
	public void printList(List<?> list) {
		
		for(Object s:list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		GenricDemo3 g3 = new GenricDemo3();
		g3.printList(list);
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("python");
		list1.add("cpp");
		
		g3.printList(list1);
		
	}
}
