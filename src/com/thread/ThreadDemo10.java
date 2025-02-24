package com.thread;

class Calling {

	// 0 1
	public synchronized void doCall(int flag) {

		System.out.println("Current call is running....."+Thread.currentThread().getName() +"'s call");
		if (flag == 1) {
			System.out.println("New call is on waiting....");
			System.out.println("Current running call is puttin on hold....");
			System.out.println(Thread.currentThread().getName() + " is putting to wait.....");
			try {
				wait();
				System.out.println("New call is received..");
				System.out.println("New call is running...");
				System.out.println("new call is about to end...");
				System.out.println("New call enede and notifiing holded call");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		notify();
		System.out.println("Holded call received...");
		System.out.println("All call done...");

	}

}

class Call1 extends Thread {

	Calling c;

	public Call1(Calling c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.doCall(1);
	}

}

class Call2 extends Thread {

	Calling c;

	public Call2(Calling c) {

		this.c = c;
	}

	@Override
	public void run() {
		c.doCall(0);
	}

}

public class ThreadDemo10 {

	public static void main(String[] args) {
		
		Calling calling = new Calling();
		Call1 c1 = new Call1(calling);
		Call2 c2 = new Call2(calling);
		
		c1.setName("AMIT");
		c2.setName("RAJ");
		
		c1.start();
		c2.start();
		
		

	}
}
