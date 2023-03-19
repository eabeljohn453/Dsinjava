package com.eabel.samples;

import java.util.Scanner;

public class Trailing {

	public static int trailingzero(int n) {
		int res = 0;
		int powoffive = 5;
		while (n >= powoffive) {
			res = res + (n / powoffive);
			powoffive=powoffive* 5;
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find trailing of zeros");
		int n = sc.nextInt();
		int res=trailingzero(n);
		System.out.println("the trailing zero's is: "+res);

	}

}
