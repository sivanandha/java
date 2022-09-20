package com.example;

import java.io.IOException;

class Mm {
	void method() throws IOException {
		System.out.println("device operation performed");
	}
}

public class Throw1 {

	public static void main(String[] args) throws IOException {
		Mm m = new Mm();
		m.method();
		System.out.println("normal flow");

	}

}
