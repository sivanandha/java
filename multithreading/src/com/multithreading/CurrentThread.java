package com.multithreading;

public class CurrentThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		CurrentThread c = new CurrentThread();
		CurrentThread c1 = new CurrentThread();

		// c.start();
		c.setName("mallaiah");
		c.start();
	}

}
