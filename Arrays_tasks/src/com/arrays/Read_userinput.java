package com.arrays;

import java.util.Scanner;

public class Read_userinput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the user input::");
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
