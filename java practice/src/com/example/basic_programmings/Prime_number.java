package com.example.basic_programmings;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		while (true) {
			int count = 0;

			Scanner scan = new Scanner(System.in);
			System.out.println("enter the n value");
			int n = scan.nextInt();
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {

					count++;
				}

			}

			if (count == 2)
				System.out.println("prime number ");
			else
				System.out.println("not a prime number ");

		}
	}
}
