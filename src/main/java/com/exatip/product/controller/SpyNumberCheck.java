package com.exatip.product.controller;

import java.util.Scanner;

public class SpyNumberCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if (isSpyNum(num))
			System.out.println(num + " is a Spy number. ");
		else
			System.out.println(num + " is not a Spy number. ");
	}

	public static boolean isSpyNum(int num) {
		int sum = 0;
		int product = 1;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			product = product * digit;
			num = num / 10;
		}
		return sum == product; // true or false
	}
}
