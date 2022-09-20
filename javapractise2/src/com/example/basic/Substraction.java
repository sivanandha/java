package com.example.basic;

public class Substraction {

	public static void sub() {
		int a = 10;
		int b = 30;
		int c = a + b;
		System.out.println("substraction of two numbers: " + c);

	}

	public static void main(String[] args) {
		sub();// first way
		// 2 nd way
		Substraction substraction = new Substraction();
		substraction.sub();
	}

}
