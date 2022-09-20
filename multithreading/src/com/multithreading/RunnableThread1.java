package com.multithreading;

public class RunnableThread1 implements Runnable {
	public void run() {
		System.out.println("this is runnable thread2");
	}

	public static void main(String[] args) {
		RunnableThread1 r = new RunnableThread1();
		Thread thread = new Thread(r);
		thread.start();
	}

}
