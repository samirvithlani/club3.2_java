package com.exception;

import java.io.File;
import java.io.FileNotFoundException;

class ScanData {
	
	
		public ScanData(String str) {
			
		}
		
		public ScanData(File file) throws FileNotFoundException {
			
			
		}
		
		public void demo() {
			
		}
		public void demo1()throws FileNotFoundException{
			
			
			
		}
	
	
}

public class ExceptionDemo10 {

	
	public static void main(String[] args) {
		
		//ScanData sc = new ScanData("");
		try {
			ScanData sc = new ScanData(new File(""));
			//ScanData sc = new ScanData(new File(""));
			sc.demo();
			sc.demo1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ScanData sc = new ScanData("");		
		
	}
}
