package com.example.basic;

import java.util.Scanner;

public class Addition_method {

	public static int name(int a, int b) {
		int c = a + b;
		System.out.println("addition of numbers is" + c);

		return c;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the a value:");
		int a = scanner.nextInt();
		System.out.println("enter the b value:");
		int b = scanner.nextInt();
		name(a, b);

	}

}
