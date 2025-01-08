package com.collection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo5 {

	
	public static void main(String[] args) {
		
	
		TreeMap<String, List<Integer>> marks = new TreeMap<String,List<Integer>>();
		List<Integer> ramMarks = new ArrayList<Integer>();
		ramMarks.add(100);
		ramMarks.add(90);
		ramMarks.add(80);
		List<Integer> shyamMarks = new ArrayList<Integer>();
		shyamMarks.add(100);
		shyamMarks.add(80);
		shyamMarks.add(70);
		
		marks.put("ram", ramMarks);
		marks.put("shyam", shyamMarks);
		
		int total =0;
		for(Entry map : marks.entrySet()) {
			
			System.out.println(map.getKey());
			
			List<Integer> markList = (List<Integer>)map.getValue();
			for(int i:markList) {
				System.out.println(i);
				total = total+i;
			}
			System.out.println("total marks = "+total);
			total=0;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
