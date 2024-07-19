package com.arrays;

public class VarArgs {

	
	public void test(int a,int b) {
		
		System.out.println(a + " "+b);
	}
	
	public void test2(int x,int ...a) {
		System.out.println("x..."+x);
		for(int s:a) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		
		VarArgs va = new VarArgs();
		va.test(10, 20);
		va.test2(10,20,30,405);
		
	}
}
