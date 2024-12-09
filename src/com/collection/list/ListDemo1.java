package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	// Object class is parent class of all java class..
//	public String toString() {
//	
//		return "hi List Demo1";
//	}
//	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java"); // 0th index
		list.add(0, "C");//
		list.add("cpp");

		list.add("python");

		System.out.println(list);

		System.out.println(list.get(0));

//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

		for (String s : list) {
			System.out.println(s);
		}

	}

}
