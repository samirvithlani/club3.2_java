package com.random;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		//player 6 ball 
		//if player hits 0 -->then it is out
		//player can take max 6 runs
		String users[] = new String[] {"ram","shyam","seeta","geeta","hari"};
		 
		
		Random random = new Random();
		int rno = random.nextInt(5);
		System.out.println(rno);
		System.out.println(users[rno]);
		
		
	}
}
