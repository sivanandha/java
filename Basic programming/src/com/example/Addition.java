package com.example;

public class Addition {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		Addition a = new Addition();

		int n = a.add(2, 3);

	}

}
