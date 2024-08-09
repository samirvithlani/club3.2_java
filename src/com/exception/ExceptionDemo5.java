package com.exception;

public class ExceptionDemo5 {

	
	public int divide(int no1,int no2) throws Exception {
		
		//try catahc /// divisin....
		
		return no1 / no2;
	}
	
	public static void main(String[] args) throws Exception  {
		
		ExceptionDemo5 e1 = new ExceptionDemo5();
//		try {
//			e1.divide(12, 0);
//		}catch (Exception e) {
//			
//			System.out.println("can not divide by zero");
//		}
		
		
		e1.divide(12, 0);
		
		
	}
}
