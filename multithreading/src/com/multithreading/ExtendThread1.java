package com.multithreading;

public class ExtendThread1 extends Thread {

	public void run() {
		System.out.println("This is a thread1");
	}

	public static void main(String[] args) {
		ExtendThread1 e = new ExtendThread1();
		ExtendThread1 e1 = new ExtendThread1();
		e.start();
		e1.start();

	}

}
