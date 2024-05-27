package com.method_var;

public class VarDemo {

	// instance variable...
	// instance variable not need to intilize compul....
	// non static..
	// can not use non static instance variable inside static method...
	int a;
	static int c; // static instance...
	// if instance variable is nbot assigned it will give default value.

	public void test() {

		System.out.println(a);
		System.out.println(c);
		// both non static and static instance variable can be use and call inside non
		// static method
	}

	public static void main(String[] args) {

		//System.out.println(a); error..
		System.out.println(c);

	}

}
