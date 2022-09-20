package com.multithreading;

public class RunnableThread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		RunnableThread2 r = new RunnableThread2();
		Thread t = new Thread(r);
		t.start();
	}
}
