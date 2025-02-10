package com.collection.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	
	public static boolean check (int no,Predicate<Integer> predicate){
		//no =100
		//x->x>=100
		return predicate.test(no); //true false
	}
	
	
	
	public static void main(String[] args) {
		
		//Predicate --> statament true false..
		
		Predicate<Integer> isEven = (num)->num%2==0;
		System.out.println(isEven.test(101));
		System.out.println(isEven.test(100));
		
		
		
		System.out.println("1"+check(100, x->x>=100));
		System.out.println("2 "+check(91, isEven) );
		
		
		
		
		
	}
}
