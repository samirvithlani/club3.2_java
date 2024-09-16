package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {
		
		
		
		double d = 100.50;
		float f = 3.14f;
		
		try {
			RandomAccessFile random = new RandomAccessFile("randon.txt", "rw");
//			
//			random.writeUTF("Hello welcomet to royal");
//			
//			//set pointer at 0th position
//			random.seek(0);
//			System.out.println(random.read());
//			random.seek(0);
//			byte []b = {1,2,3,4};
//			System.out.println(random.read(b));
			//c----
			random.writeChar('c');
			random.seek(0);
			System.out.println(random.readChar());
			//100.5c----
			random.seek(0);
			random.writeDouble(d);
			random.seek(0);
			System.out.println(random.readDouble());
			
			random.seek(0);
			random.writeFloat(f);
			random.seek(0);
			System.out.println(random.readFloat());
			
			
			random.seek(0);
			random.writeInt(100);
			random.seek(0);
			System.out.println(random.readInt());
			
			
			random.seek(0);
			byte[] arr = new byte[(int)random.length()];
			random.readFully(arr);
			
			String str1 = new String(arr);
			System.out.println(str1);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
