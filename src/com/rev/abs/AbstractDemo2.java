package com.rev.abs;

abstract class GParent {

	public abstract void loan();

}

abstract class Parent extends GParent {

	// no need to override..

	public void loan() {

	}
}

public class AbstractDemo2 extends Parent {

	public void loan() {

	}

	public static void main(String[] args) {
		
		GParent gp = new AbstractDemo2();//gp...
		Parent p = new AbstractDemo2();//p
				

	}
}
