package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(120);
		list.add(200);
		list.add(10);
		list.add(119);
		
		for(int i:list) {
			System.out.println(i);
		}
	}
}
