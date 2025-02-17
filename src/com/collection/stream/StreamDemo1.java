package com.collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	
	public static void main(String[] args) {
		
		//Stream interface..
		List<String> names = Arrays.asList("Amit","shyam","sundar","daya","jetha");
		//names.stream().forEach(System.out::println);
		//names.stream().filter(x->x.startsWith("s")).forEach(System.out::println);
		
//		List<String> filtnames = new ArrayList<String>();
//		for(String s:names) {
//			if(s.startsWith("s")) {
//				filtnames.add(s);
//			}
//		}
//		
//		for(String s :filtnames) {
//			System.out.println(s);
//		}
		
	//	List<String> filtNames = names.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
//		filtNames.stream().forEach(System.out::println);
		
		
		//names.stream().map(String::toUpperCase).forEach(System.out::println);
//		List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
//		upperNames.stream().forEach(System.out::println);
		
		
		names.stream().filter(x->x.startsWith("s")).map(String::toUpperCase).forEach(System.out::println);
		
		
		
		
		
		
		
	}
}
