package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePalindrome {

	// the //ok

	public static boolean isPalindrome(String str) {
		// abbbba

		int start = 0;
		int end = str.length() - 1;

		// 0 end 4
		// 1 end 3
		while (start < end) {
			// [0] = n !=[4]n
			// a[1] =a !=3[a] false
			if (str.charAt(start) != str.charAt(end)) {
				return false;

			}
			start++; // 1 //2
			end--;// 3//2
		}
		return true;

	}

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("pali.txt"));
			int count = 0;
			while (sc.hasNext()) {

				String word = sc.next();// the // ok
				if (isPalindrome(word)) {
					count++;
				}

			}
			System.out.println("count = "+count);
			
			String[] palindromes = new String[count];
			int index = 0;
			while (sc.hasNext()) {

				String word = sc.next();// the // ok
				if (isPalindrome(word)) {
					// palindromes[0] = "naman"
					// palindromes[1] = "jay"
					palindromes[index++] = word;
				}

			}
			// sop(word);

			for (int i = 0; i < palindromes.length; i++) {

				System.out.println(palindromes[i]);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
