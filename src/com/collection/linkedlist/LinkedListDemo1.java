package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//List<String> l = new LinkedList<String>(); // list....
		//Queue<String> l1 = new LinkedList<String>();
		
		LinkedList<String> link  = new LinkedList<String>();
		link.add("java");
		link.add(0, "c");
		link.add("cpp");
		link.addLast("css");
		link.addFirst("python");
		
		
		//remove...
		
		//System.out.println("removing..."+link.remove());
		//System.out.println("removing..."+link.remove(1));
		//System.out.println("removing..."+link.remove("css"));

		//link.clear();
		//System.out.println("peek..."+link.peek());
		//System.out.println("poll"+link.poll());
		
		//System.out.println("element"+link.element());
		//link.pop();
		
		//link.removeFirst();
		//link.removeLast();
		
		//link.pollFirst();
		//link.pollLast()
		
		//link.removeIf(filter)
		
		//System.out.println(link.contains("css"));
		//link.indexOf("");
		//link.lastIndexOf("")
		
		
		//link.getFirst();
		//link.getLast()
		
		//link.isEmpty();
		//link.subList(1, 3)
		
		//link.set(0, "ram");
		
		
		
		
		
		
		
		
		
		for(String s:link) {
			System.out.println(s);
		}
		
	}
}
