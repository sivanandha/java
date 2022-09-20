package com.example.static_method;

public class Calculate {
	static int cube(int r) {
		return r * r * r;

	}
	public static void main(String[] args) {
		//int c=Calculate.cube(5);
		int c = cube(5);
		System.out.println(c);
	}
}
