package com.example;

import java.io.IOException;

class Mn {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class Thows3 {

	public static void main(String[] args) throws IOException {

		Mn mn = new Mn();
		mn.method();
		System.out.println("normal method");
	}

}
