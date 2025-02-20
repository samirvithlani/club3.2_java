package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo7 implements Runnable{

	static List<String> fruits ;
	public static int index =0;
	public static void main(String[] args) {
		
		
		fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Lichi");
		fruits.add("Mango");
		
		ThreadDemo7 threadDemo7 = new ThreadDemo7();
		Thread t1 = new Thread(threadDemo7);
		Thread t2 = new Thread(threadDemo7);
		Thread t3 = new Thread(threadDemo7);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();
				
		
	}
	


	@Override
	public void run() {
		
		ThreadDemo7.process(); //static...
		
	}
	public synchronized static  void process() {
		
		
		while(index<fruits.size()) {
			
			System.out.println(Thread.currentThread().getName() + " ->"+ fruits.get(index));
			index++;
		}
		
		
	}


	
	
}
