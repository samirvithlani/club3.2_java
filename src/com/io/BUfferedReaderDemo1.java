package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BUfferedReaderDemo1 {

	//FileReader --> file ->char
	public static void main(String[] args) {
		String data ="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
			while((data = reader.readLine())!=null) {
				System.out.println(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
