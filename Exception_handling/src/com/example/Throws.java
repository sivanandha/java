package com.example;

import java.io.IOException;

public class Throws {

	void addition() throws IOException {
		new IOException("this is io exception");
	}

	public static void main(String[] args) throws IOException {
		Throws t = new Throws();
		t.addition();
		System.out.println("normal flow");
	}

}
