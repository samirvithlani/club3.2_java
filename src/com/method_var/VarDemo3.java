package com.method_var;

public class VarDemo3 {

	
	public void test() {
		int p = 1;
		float z=100;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		int a;
		int p =100;
		//System.out.println(a);
		//can not create static variable inside method reason, heap and stack concept...
		
		VarDemo3 v3 = new VarDemo3();
		v3.test();
		
		
	}
}
