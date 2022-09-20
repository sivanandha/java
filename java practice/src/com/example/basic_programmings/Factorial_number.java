package com.example.basic_programmings;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		while (true) {
			int fact = 1;

			Scanner scan = new Scanner(System.in);
			System.out.println("enter the n value");
			int n = scan.nextInt();
			
			for (int i = 1; i <= n; i++) {
				fact=fact*i;
				}
			System.out.println(fact);
			}	
		}
	}
