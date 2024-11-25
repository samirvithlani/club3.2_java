package com.rev.abs;

interface Clonable{
	
	//interface instance variable..
	
	//all instance variable in interface
	//are public final static 
	int x=10;
	
	public void clonning();
	
}
//class : with extra fac... interface keyword,, is fully abstract...all methods will be public abstract ..
public class InerfaceDemo implements Clonable {
	
	int y;
	
	public final static int p=100;
	

	@Override
	public void clonning() {
		// TODO Auto-generated method stub
		
		
	}

	public static void main(String[] args) {
		
		Clonable c = new InerfaceDemo();
		c.clonning();
		System.out.println(Clonable.x);
		System.out.println(InerfaceDemo.p);
		
	}
	
	
	
	
}
