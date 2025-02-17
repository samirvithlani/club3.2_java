package com.thread;

public class ThreadDemo1 extends Thread{
	
	
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"..Thread is running...." +i);
		}
	}

	
	public static void main(String[] args) {
		
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		ThreadDemo1 t3 = new ThreadDemo1();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
