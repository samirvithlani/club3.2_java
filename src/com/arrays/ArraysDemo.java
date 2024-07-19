package com.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int x[] = new int[10];
		int y[] = new int[] {1,20,3,45,5};
		
		//Arrays.sort(y);
		
//		for(int i=0;i<y.length;i++) {
//			
//			System.out.println(y[i]);
//		}
		
		
		for(int i:y) {
			System.out.println(i);
		}
		
		int ind = Arrays.binarySearch(y, 3);
		System.out.println("ind "+ind);
		
		
		String strs[] = new String[] {"amit","raj","parth","akshit"};
		Arrays.sort(strs);
		
		for(String s:strs) {
			System.out.println(s);
		}
		
		int ind1 = Arrays.binarySearch(strs, "parth");
		System.out.println("index1 = "+ind1);
		
		
		int y1[] = Arrays.copyOf(y, 5);
		for(int s:y1) {
			System.out.println(s);
		}
		
//		Arrays.fill(y1, 100);
//		for(int s:y1) {
//			System.out.println(s);
//		}
//		
		
		//Arrays.asList(y);
		
		
		
		
		
		
	}
}
