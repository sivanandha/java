package com.example;

public class Null_pointer_exception {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}

		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("program should end");
		}

	}

}
