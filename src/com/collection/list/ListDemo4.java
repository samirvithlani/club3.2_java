package com.collection.list;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	
	int id;
	String name;
	float marks;
	
	public Student(int id, String name, float marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	
}

public class ListDemo4 {

	
	public static void main(String[] args) {
		
		
		String[] class11 = new String[] {"ram","shyam","seeta"};
		String[] class10 = new String[] {"ram","shyam","seeta"};
		String[] class12 = new String[] {"ram","shyam","seeta"};
		
		
		List<String[]> list = new ArrayList<String[]>();
		list.add(class10);
		list.add(class10);
		list.add(class10);
		
		///itration...
		
		
		List<Student> studentList = new ArrayList<Student>();
		Student s1 =new Student(101, "raj", 78.89f);
		Student s2  =new Student(102, "amit", 65.78f);
		Student s3  =new Student(103, "kunal", 88.78f);
		
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(new Student(104, "ajay", 90f));
		
		for(Student stu:studentList) {
			System.out.println(stu.id + " "+stu.name + " "+stu.marks);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
