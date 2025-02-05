package com.collection.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Book implements Comparable<Book>{
    String name;
    int price;

    public Book(String bName, int bPrice) {

        this.name = bName;
        this.price = bPrice;
    }

    @Override
    public int compareTo(Book o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.name.length(), o.name.length());
    }
}

public class ComparableDemo{
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Java", 100));
        books.add(new Book("a",200));
        books.add(new Book("Python",300));
        books.add(new Book("css",400));

        Collections.sort(books);
        for(Book b:books){
           System.out.println(b.name);
        }

        
    }
}