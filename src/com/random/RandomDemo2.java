package com.random;

import java.util.Random;

public class RandomDemo2 {

	
	public static void main(String[] args) {
		
		//{"virat",0},{"sachin",0}
		//virat 100
		//sachin 100
		//ms      101
		
		Object obj [][] = new Object[3][2];
		
		Random random = new Random();
		
		for(int i=1;i<=6;i++) {
			
			int runs =random.nextInt(7);
			System.out.println(runs);
		}
		
		
		obj[0][0] ="virat";
		obj[0][1]= 100;
		
		obj[1][0]="sachin";
		obj[1][1]= 110;
		
		obj[2][0]="MS";
		obj[2][1]= 120;
		
		
		for(int i=0;i<obj.length;i++) {
			
			for(int j=0;j<obj[i].length;j++) {
				System.out.print(obj[i][j]);
				System.out.print("\t ");
			}
			
			System.out.println("  ");
		}
		
				
		

		
	}
}
