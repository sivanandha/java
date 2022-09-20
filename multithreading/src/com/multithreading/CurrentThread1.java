package com.multithreading;

public class CurrentThread1 extends Thread {
	public void run() {
		System.out.println("runingg");
	}

	public static void main(String[] args) {
		CurrentThread1 c1 = new CurrentThread1();
		CurrentThread1 c2 = new CurrentThread1();
		System.out.println("name of c1: " + c1.getName());
		System.out.println("name of thread c2: " + c2.getName());
		// c1.start();
		// c2.start();
		c1.setName("mallaiah chillapothu");
		System.out.println("name of t1: " + c1.getName());
		System.out.println("name of thread c2: " + c2.getName());

	}

}
