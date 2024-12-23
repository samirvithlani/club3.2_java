package com.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("jay");
		set.add("amit");
		set.add("zara");
		set.add("parth");
		set.add("parth");
		
		//System.out.println("celling"+set.ceiling("s"));
		//System.out.println(set.higher("parth"));
		
		
//		System.out.println("floor"+set.floor("zaraa"));
//		System.out.println("lower.."+set.lower("zara"));
		
		
		NavigableSet<String> ns = set.descendingSet();
		
		//SortedSet<String> ss = set.subSet("amit", "parth");
		//SortedSet<String> ss = set.subSet("amit",true ,"parth",true);
		
		//SortedSet<String>ss = set.tailSet("parth");
		//SortedSet<String>ss = set.headSet("qr");
		
		
		System.out.println("removing...."+set.pollFirst());
		System.out.println("removing...."+set.pollLast());
		for(String s:set) {
			System.out.println(s);
		}
		
		
	}
}
