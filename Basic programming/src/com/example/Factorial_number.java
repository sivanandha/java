package com.example;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("enter the n value");
			int n = scan.nextInt();
			
			int sum = 1;
			for(int i=1;i<=n;i++)
			{
				sum=sum*i;
				//System.out.println(sum);
			}
			System.out.println(sum);
	}
	}
}
