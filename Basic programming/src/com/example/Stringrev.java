package com.example;

import java.util.Scanner;

public class Stringrev {

	public String rever(String original) {
		String rev = " ";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);

		}
		System.out.println(" String reverse:" + rev);

		return rev;
	}
	public static void main(String[] args) {
		while (true) {
			String original;
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the string");
			original = scan.nextLine();
			Stringrev s = new Stringrev();
			s.rever(original);
		}
	}
}
