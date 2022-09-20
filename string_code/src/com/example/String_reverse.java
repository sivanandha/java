package com.example;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		String original;
		String rev = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		original = scan.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println("String reverse is:" + rev);

	}

}
