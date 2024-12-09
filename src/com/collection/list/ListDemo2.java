package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("java"); // 0th index
		list.add(0, "C");//
		list.add("cpp");

		list.add("python");
		list.add("java"); 
		list.add("cpp");

		System.out.println(list);
		
		
		System.out.println("contains..."+list.contains("C"));
		//list.clear();
		System.out.println("empty...?"+list.isEmpty());
		System.out.println("index..."+list.indexOf("cpp"));
		System.out.println("last indexof "+list.lastIndexOf("cpp"));
		List<String> slist = list.subList(1, 5);
		System.out.println(slist);
	}
}
