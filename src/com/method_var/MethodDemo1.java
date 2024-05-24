package com.method_var;

public class MethodDemo1 {

	public void test() {

		// non static wo return type wihout argument...
		System.out.println("test method called...");
		// any non static method can be called only with class's object if we are calling from static method
		// but if you want to call non static method from non static method no need of
		// object...

	}

	public int sum(int a, int b) {
		// non static wa r with argument
		// int c = a + b;
		// return c;
		return a + b;
	}

	public boolean isValid() {
		// non static method --> non sattic method call
		sum(100, 200);
		return false;

	}

	public static void main(String[] args) {

		// how to create an object of class..
		MethodDemo1 m1 = new MethodDemo1();
		m1.test();
		
		int ans = m1.sum(100, 20);
		System.out.println("ans  = " + ans);

		boolean ans1 = m1.isValid();
		System.out.println("ans = " + ans1);

		if (m1.isValid()) {
			System.out.println("true...");
		} else {
			System.out.println("false...");
		}

	}
}
