package com.example.arrays;

import java.util.Scanner;

public class Adv_Calculatror {
	public static int Addition(int a, int b) {
		int result = a + b;
		System.out.println("addition of two numbers:" + result);
		return result;
	}

	public static int substraction(int a, int b) {
		int result = a - b;
		System.out.println("substraction of two numbers:" + result);
		return result;
	}

	public static int multiplication(int a, int b) {
		int result = a * b;
		System.out.println("multiplication of two numbers:" + result);
		return result;
	}

	public static int dividion(int a, int b) {
		int result = a / b;
		System.out.println("division of two numbers:" + result);
		return result;
	}

	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the a value:");
		int a = scan.nextInt();
		System.out.println("enter the b value:");
		int b = scan.nextInt();
		System.out.println("enter the operation value:");
		System.out.println("1.addition\n2.subsstraction\n3.multiplication\n4.division");
		int op =scan.next().charAt(0);
		switch (op) {
		case '1':
			Adv_Calculatror.Addition(a, b);
			break;
		case '2':
			Adv_Calculatror.substraction(a, b);
			break;
		case '3':
			Adv_Calculatror.multiplication(a, b);
			break;
		case '4':
			Adv_Calculatror.dividion(a, b);
			break;
		default:
			System.out.println("your hit wrong");
            break;
		}

	}
	}
}
