package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		
		try {
			OutputStream output = new FileOutputStream("abc1.txt");
			String data = "hi this is india";
			byte b[] = data.getBytes();
			try {
				//output.write(b);
				output.write(data.getBytes());
				System.out.println("done...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
