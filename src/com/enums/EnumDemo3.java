package com.enums;

public class EnumDemo3 {

	enum Calc {
		ADD, SUB, MUL, DIV
	}

	public void calulate(int a, int b, Calc c) {
		int ans = 0;
		switch (c) {
		case ADD:
			ans = a + b;
			break;
		case SUB:
			ans = a - b;

		default:
			ans = 0;
			System.out.println("invalid choice...");
			break;
		}
		System.out.println(ans);

	}

	public static void main(String[] args) {

		EnumDemo3 e1 = new EnumDemo3();
		e1.calulate(100, 20, Calc.ADD);
	}
}
