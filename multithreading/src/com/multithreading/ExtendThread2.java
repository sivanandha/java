package com.multithreading;

public class ExtendThread2 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		ExtendThread2 e2 = new ExtendThread2();
		// ExtendThread2 e3 = new ExtendThread2();
		e2.start();
		// e3.start();

	}

}
