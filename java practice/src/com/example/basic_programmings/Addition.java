package com.example.basic_programmings;

import java.util.Scanner;

public class Addition {
	static int addition(int x, int y) {
		int result = x + y;
		System.out.println(" result of x and y:" + result);
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the x value");
		int x = scan.nextInt();
		System.out.println("enter the b value:");
		int y = scan.nextInt();

		Addition.addition(x, y);
	}

}
