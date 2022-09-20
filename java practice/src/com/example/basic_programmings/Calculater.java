package com.example.basic_programmings;

import java.util.Scanner;

public class Calculater {
	public int addition(int a, int b) {
		int result = a + b;
		System.out.println("addition of two numbers is:" + result);
		return result;

	}

	public int substraction(int a, int b) {
		int result = a - b;
		System.out.println("substraction of two numbers is:" + result);
		return result;

	}

	public int multiplication(int a, int b) {
		int result = a * b;
		System.out.println("multiplication of two numbers is:" + result);
		return result;

	}

	public int division(int a, int b) {
		int result = a / b;
		System.out.println("division of two numbers is:" + result);
		return result;

	}

	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the a value:");
		int a = scan.nextInt();
		System.out.println("enter the b value:");
		int b = scan.nextInt();
		System.out.println("enter the operation:");

		System.out.println("1.addition\n2.substracto\n3.multiplication\n4.division.");
  int op=scan.next().charAt(0);
		//char op = scan.next().charAt(0);
		Calculater m = new Calculater();
		switch (op) {
		case '1':
			m.addition(a, b);
			break;

		case '2':
			m.substraction(a, b);
			break;

		case '3':
			m.multiplication(a, b);
			break;

		case '4':
			m.division(a, b);
			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

	}
}
}
