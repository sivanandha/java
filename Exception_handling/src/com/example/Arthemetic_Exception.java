package com.example;

public class Arthemetic_Exception {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(100 / 0);

		} catch (ArithmeticException e) {

			System.out.println(e);
			System.out.println(4);
			System.out.println(5);
		}

	}

}
