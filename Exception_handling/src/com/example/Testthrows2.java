package com.example;

import java.io.IOException;

class M {
	void m() throws IOException {
		throw new IOException("device error");
	}
}

public class Testthrows2 {

	public static void main(String[] args) throws IOException {
		M m = new M();

		try {
			m.m();
		} catch (IOException e) {
			System.out.println("Exception handled");
		}
		System.out.println("normal flow");
	}
}
