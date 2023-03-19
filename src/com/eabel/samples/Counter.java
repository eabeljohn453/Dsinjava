package com.eabel.samples;

import java.util.Scanner;

public class Counter {
	public static int getdigitCount(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
		
	}

	public static void main(String args[]) {
		System.out.println("Program of digit count");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int count = getdigitCount(n);
			System.out.println("number of digit in a number is  " + count);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
