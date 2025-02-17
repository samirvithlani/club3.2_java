package com.thread;

class Thread1 extends Thread{
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is running...");
	}
}

class Thread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running...");
	}
	
}

public class ThreadDemo2  {

	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();
		
		
	}
}
