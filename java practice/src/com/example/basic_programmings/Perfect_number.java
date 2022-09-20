package com.example.basic_programmings;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		while (true) {
			int sum = 0;

			Scanner scan = new Scanner(System.in);
			System.out.println("enter the n value");
			int n = scan.nextInt();
			int temp = n;
			for (int i = 1; i <= n / 2; i++) {
				if (n % i == 0) {

					sum = sum + i;
				}
				//System.out.println(sum);
			}
			System.out.println(sum);
			if (temp == sum)
				System.out.println("perfect number ");
			else
				System.out.println("not a perfect number ");

		}

	}

}
