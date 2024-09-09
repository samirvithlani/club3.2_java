package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Streamdemo {

	
	public static void main(String[] args) {
		
		
		try {
			InputStream input = new FileInputStream(new File("abc.txt"));
			int c;
			while((c = input.read())!=-1) {
				System.out.print((char)c);
			}
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
