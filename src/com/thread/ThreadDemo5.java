package com.thread;

public class ThreadDemo5  extends Thread{

	
	
	
	
	@Override
	public void run() {
	
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName() + " is running.....");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		ThreadDemo5 t1 = new ThreadDemo5();
		ThreadDemo5 t2 = new ThreadDemo5();
		ThreadDemo5 t3 = new ThreadDemo5();
		
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		//syncronzation....
		
		
		
		
	}
}
