package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//queue --> LinkedList,prior
//LinkedList impl queue,List
public class QueueDemo {

	
	
	public static void main(String[] args) {
		
		
		
		Queue<String> q = new PriorityQueue<String>();
		
		q.add("sumit");
		q.add("neha");
		q.add("aarit");
		q.add("amit");
		q.add("parth");
		q.add("kunal");
		
//		for(String s:q) {
//			System.out.println(s);
//		}
		
		
		System.out.println("removing...."+q.remove());
		q.remove("amit");
		
		//q.offer("ok");
		
		
		
		for(String s:q) {
			System.out.println(s);
		}
		
		
		
		
	}
}
