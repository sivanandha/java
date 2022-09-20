package com.example;

import java.util.Scanner;

public class Fibanacis_series {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("enter the n value");
			int n = scan.nextInt();
			int a = 0;
			int b = 1;
			// int c;
			for (int i = 0; i < n; i++) {
				int c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
			// System.out.println(a);

		}
	}
}
