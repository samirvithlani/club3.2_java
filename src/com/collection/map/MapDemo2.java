package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String[]> states = new HashMap<Integer, String[]>();
		states.put(1, new String[] {"india","usa","china"});
		states.put(2, new String[] {"japan","indonesia","taiwan"});
		states.put(3, new String[] {"germany","france","uk"});
		
		
		for(Entry map : states.entrySet() ) {
			
			System.out.println(map.getKey());
			
			for(String s : (String[])map.getValue()) {
				System.out.println(s);
			}
			
			
		}
		
	}
}
