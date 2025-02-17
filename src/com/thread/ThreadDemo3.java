package com.thread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		
		
		Runnable t1= ()->{
			System.out.println("Thread is running...");
		};
		Runnable t2= ()->{
			System.out.println("Thread is running...");
		};
		
		
		t1.run();
		t2.run();
	}
}
