package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		
		try {
			//FileWriter writer = new FileWriter("demo11.txt");
			FileWriter writer = new FileWriter("demo11.txt",true);
			writer.write("Hello this is file 2");
			writer.close();
			System.out.println("done...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
