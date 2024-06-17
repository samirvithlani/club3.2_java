package com.oops.poly.overriding;

class TRAI {

	public void call() {
		System.out.println("call method of Trai class...");
	}

	private void mms() {
		System.out.println("mms of TRAI");
	}

	void task() {
		System.out.println("task of TRAI..");
	}

	protected void task2() {

		System.out.println("task 2 of TRAI");
	}

	public int reach() {

		return 100;
	}
	public final void greet() {
		System.out.println("final method.... of TRAI");
	}
	
	public static void map() {
		
		System.out.println("map of TRAI");
	}

}

class JIO extends TRAI {

	public void call() {
		System.out.println("call method of JIO CLASS");
	}

	private int mms() {
		System.out.println("mms of TRAI");
		return 0;
	}

	public void task() {

		System.out.println("task method of JIO");
	}

	protected void task2() {

		System.out.println("task2 of jio");
	}

	public int reach() {

		return 100;
	}
	
	public void greet1() {
		System.out.println("greet of jio");
	}
	
	public static void map() {
		System.out.println("jio map");
	}

}

public class OverRidingDemo {

	public static void main(String[] args) {

		JIO j = new JIO();
		j.call();

	}
}
