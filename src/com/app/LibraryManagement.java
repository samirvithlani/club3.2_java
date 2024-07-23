package com.app;

import java.util.Scanner;

//author,user
//book add
//book delete
//book update
//book rent
//rent collect
//rent display

//user can view all books
//user can rent book..
//user can pay rent..

class User {

	int id;
	String userName;

	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}

}

class Author {

	int aId;
	String authorName;
	public Author(int aId, String authorName) {
		
		this.aId = aId;
		this.authorName = authorName;
	}
	
	
	
}

class Book {

	int bId;
	String bookName;
	int bookRent;
	boolean isAvailable;
	Author bookAuthor;

	public Book(int bId, String bookName, int bookRent, boolean isAvailable, Author bookAuthor) {
		this.bId = bId;
		this.bookName = bookName;
		this.bookRent = bookRent;
		this.isAvailable = isAvailable;
		this.bookAuthor = bookAuthor;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

}

public class LibraryManagement {

	static int flag;
	
	Book book;
	

	public void addBook() {
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("enter book name");
//		String bName = sc.next();
		
		//author obj
		Author a1 = new Author(1,"ram");
		Book b1 = new Book(101, "java", 20, true, a1);
		book = b1;
		System.out.println("book added successfully............");
		
	}

	public void viewBooks() {
		System.out.println("*****************************Book DATA **********************************");
		System.out.println(book.bookName);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("please select your role: press 1 for author press 2 for user 3 for exit");
			flag = sc.nextInt();
			LibraryManagement lb = new LibraryManagement();
			lb.controller();
		} while (flag != 3);
	}

	public void controller() {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		if (flag == 1) {
			do {
				System.out.println("welcome to author dashboard...");
				System.out.println("enter 1 for add your book...");
				System.out.println("enter 2 for view your books");
				System.out.println("enter 2 for exit..");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					addBook();
					break;
				case 2:
					viewBooks();
					break;

				default:
					break;
				}
			} while (choice != 3);
		} else if (flag == 2) {
			System.out.println("welcome to user dashboard...");
		} else {
			System.out.println("Invalid choice...");

		}

	}

}
