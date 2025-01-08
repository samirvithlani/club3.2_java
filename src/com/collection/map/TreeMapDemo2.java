package com.collection.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		
		
		
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("India", "Delhi");
		tmap.put("Usa", "WD");
		tmap.put("China", "Beiging");
		tmap.put("Uk", "London");
		
		//System.out.println(tmap.ceilingKey("j"));
		System.out.println(tmap.floorKey("China"));
		System.out.println(tmap.containsKey("Uk"));
		System.out.println("first.."+tmap.firstKey());
		System.out.println("beging.."+tmap.firstEntry());
		System.out.println(tmap.get(""));
		SortedMap<String, String> smap = tmap.headMap("Usa");
		smap = tmap.headMap("Usa", true);
		
		NavigableMap<String, String>  nmap= tmap.descendingMap();
		
		smap = tmap.tailMap("Uk");
		Set<String> keys = tmap.keySet();
		
//		for(String s:keys) {
//			System.out.println("keys"+s);
//		}
		
		
		
		for(Entry e:smap.entrySet()) {
			System.out.println(e.getKey() + " "+e.getValue());
		}
		
		
	}
}
