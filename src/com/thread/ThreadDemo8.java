package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo8{

	static List<String> fruits ;
	public static int index =0;
	public static void main(String[] args) {
		
		
		fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Lichi");
		fruits.add("Mango");
		
		//Runnable --> functional -> run
		Thread t1 = new Thread(ThreadDemo8::process);
		Thread t2 = new Thread(ThreadDemo8::process);
		Thread t3 = new Thread(ThreadDemo8::process);
		
		
		t1.start();
		t2.start();
		t3.start();
				
		
	}
	


	
	public  static  void process() {
		
		
		while(index<fruits.size()) {
			
			System.out.println(Thread.currentThread().getName() + " ->"+ fruits.get(index));
			index++;
		}
		
		
	}


	
	
}
