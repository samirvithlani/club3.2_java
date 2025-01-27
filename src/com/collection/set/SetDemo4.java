package com.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;


class Users {
	
	int marks;
	String name;
	int salary;
	
	public Users(int marks, String name, int salary) {
		
		this.marks = marks;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return name + " is having salary "+salary;
	}
	
	
	
}


class UserComparaotr implements Comparator<Users>{

	@Override
	public int compare(Users o1, Users o2) {
		
		return Integer.compare(o2.salary, o1.salary);
//		if(o1.salary<o2.salary)
//			return -1;
//		else if(o1.salary==o2.salary)
//			return 0;
//		
//		return 1;
		//samir = samir 0
		//ajay = samir -1
		
	//	return o1.name.compareTo(o2.name);
	}
	
}

public class SetDemo4 {

	
	public static void main(String[] args) {
		
	
		Set<Users> users = new TreeSet<Users>(new UserComparaotr());
		users.add(new Users(80, "ram", 23456));
		users.add(new Users(81, "shyam", 33456));
		users.add(new Users(90, "ajay", 53456));
		
		for(Users u : users) {
			
			System.out.println(u);
		}
		
		
		
		
		
	
	}
}
