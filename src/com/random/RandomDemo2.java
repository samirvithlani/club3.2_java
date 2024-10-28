package com.random;

import java.util.Random;

public class RandomDemo2 {

	public static void main(String[] args) {

		// {"virat",0},{"sachin",0}
		// virat 100
		// sachin 100
		// ms 101

		Object obj[][] = new Object[3][2];

		Random random = new Random();
		int sum = 0;
		obj[0][0]="virat";
		obj[1][0]="sachin";
		obj[2][0]="ms";
		for (int p = 0; p <= 2; p++) {
			
			for (int i = 1; i <= 6; i++) {

				int runs = random.nextInt(7);
				sum = sum + runs;
						
			}
			obj[p][1] = sum;
			sum=0;
			
		}
	
		System.out.println("sum " + sum);
		
		for (int i = 0; i < obj.length; i++) {

			for (int j = 0; j < obj[i].length; j++) {
				System.out.print(obj[i][j]);
				System.out.print("\t ");
			}

			System.out.println("  ");
		}

	}
}
