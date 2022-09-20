package com.example.basic_programmings;

import java.util.Scanner;

public class Print_even_odd {

	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scan.nextInt();
		if(n%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		
		}
	}

}
