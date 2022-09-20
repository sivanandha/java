package com.example;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("enter the n value");
			int n = scan.nextInt();
			int temp = n;
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum = sum + r * r * r;
				n = n / 10;
			}
			System.out.println(sum);
			if (temp == sum) {
				System.out.println("Armstrong number");
			} else {
				System.out.println("not armstrong number");
			}

		}
	}
}
