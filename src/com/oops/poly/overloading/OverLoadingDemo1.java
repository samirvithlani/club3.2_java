package com.oops.poly.overloading;

class OlParent{
	
	public void shape(float b,float h) {
		System.out.println("trialngle method called....");
	}	
	
}

public class OverLoadingDemo1 extends OlParent{

	public void shape() {
		System.out.println("shape method called....");
	}

	public int shape(float r) {

		System.out.println("Shape of circele..." + (3.14) * (r * r));
		return 0;
	}

	public void shape(int h, int w) {

		System.out.println("Shape of Rect..." + h * w);
	}

	public void shape(int h) {
		System.out.println("Shapr of Square" + h * h);
	}

	public static void main(String[] args) {

		
		OverLoadingDemo1 ol = new OverLoadingDemo1();
		//ol.shape(10,20);
		ol.shape(10.0f, 12.0f);
		
	}
}
