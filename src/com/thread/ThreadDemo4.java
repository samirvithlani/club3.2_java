package com.thread;

public class ThreadDemo4  extends Thread{
	
	
	@Override
	public void run() {
		
		//System.out.println(Thread.currentThread().getName() + " is going to sleep....");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName() + "  is running..."+i);
		}
	}

	public static void main(String[] args) {

		
		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		ThreadDemo4 t3 = new ThreadDemo4();
		ThreadDemo4 t4 = new ThreadDemo4();

		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");
		
		
		t1.start();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t4.start();
		
		
	}
}
