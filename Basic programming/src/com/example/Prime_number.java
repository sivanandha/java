package com.example;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {

		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("enter the n value");
			int n = scan.nextInt();
			int temp = n;
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			System.out.println(count);
			if (count == 2) {
				System.out.println("perfect number");
			} else {
				System.out.println("not perfect number");
			}

		}

	}

}
