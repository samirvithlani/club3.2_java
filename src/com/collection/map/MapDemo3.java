package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;

//pojo class
//plian old java object..
class Books {

	private int id;
	private String name;
	private double price;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Books(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Books() {
		// TODO Auto-generated constructor stub
	}
	

}

public class MapDemo3 {

	
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, Books> books = new HashMap<String, Books>();
		
		Books b1 = new Books();
		b1.setId(102);
		b1.setName("python");
		
		books.put("a", new Books(101, "java", 100));
		books.put("B", b1);
		
		
		for(Entry map : books.entrySet()) {
			
			System.out.println(map.getKey());
			Books b = (Books)map.getValue();
			System.out.println(b.getId() + " "+b.getName() + " "+b.getPrice());
			
		}
		
		
		
		
		
	}
	
	
	
}
