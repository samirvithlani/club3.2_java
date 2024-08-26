package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSCanner {

	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("demo11.txt"));
			int count =0;
			while(sc.hasNext()) {
				//System.out.print(sc.next());
				System.out.println(sc.next());
				count++;
			}
			
			System.out.println("count = "+count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	Scanner sc = new Scanner(System.in);
		
	}
}
