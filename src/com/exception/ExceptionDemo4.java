package com.exception;

import java.io.File;

public class ExceptionDemo4 {

	public static void main(String[] args) {

		/// java class | user defint | --> method use --> if that method has thrown any
		/// excpetion it will cause compile time exception..
		
		File file = new File("");
		try {
		file.createNewFile();
		}catch (Exception e) {
			//own msg...
		}

	}
}
