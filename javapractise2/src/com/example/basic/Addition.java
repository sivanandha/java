package com.example.basic;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the a value: ");
		int a = scanner.nextInt();
		System.out.println("enter the b value: ");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.println("addition of two numbers is:" + c);

	}

}
