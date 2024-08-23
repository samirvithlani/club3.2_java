package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		
		try {
			FileReader reader = new FileReader("demo11.txt");
			int c=0;
			while((c=reader.read())!= -1) {
				System.out.print((char)c);
			}
			reader.close();
//			int c = reader.read();
//			System.out.println(c);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
