package com.example;

import java.util.Scanner;

public class String_reverse_method {

	public String revrese_method(String original) {
		String rev = " ";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println("String reverse is:" + rev);
		return rev;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String original = scan.nextLine();
		String_reverse_method b = new String_reverse_method();
		b.revrese_method(original);

	}

}
