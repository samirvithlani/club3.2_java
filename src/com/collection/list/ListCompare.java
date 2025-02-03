package com.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class NameComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}

}

class NameComparable implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return o.compareTo("a");
	}
	
}

public class ListCompare {

	public static void main(String[] args) {
		
		
		
//		TreeSet<String> ts = new TreeSet<String>(new NameComparator());
//		ts.add("kunal");
//		ts.add("parth");
//		ts.add("amitaaa");
//		ts.add("shyam");
//		ts.add("ajit");
//		
//		for(String s:ts) {
//			System.out.println(s);
//			
//		}

		

List<String> list = new ArrayList<String>();
		list.add("kunal");
		list.add("parth");
		list.add("amitaaa");
		list.add("shyam");
		list.add("ajit");

		list.sort(new NameComparator());
		
		for (String s : list) {
			System.out.println(s);
		}

	}
}
