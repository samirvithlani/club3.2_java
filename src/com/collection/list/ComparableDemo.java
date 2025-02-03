package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
	
	String bName; //java //pyton
	int bPrice;
	
	
	
	public Book(String bName, int bPrice) {
		
		this.bName = bName;
		this.bPrice = bPrice;
	}


	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.bName.length(), o.bName.length());
	}
	
	
}

public class ComparableDemo {

	
	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("java",100));
		books.add(new Book("python", 200));
		books.add(new Book("pytho", 200));
		books.add(new Book("a", 200));
		
		
		Collections.sort(books);
	
		
		for(Book b:books) {
			System.out.println(b.bName  + " "+b.bPrice);
		}
	}
}
