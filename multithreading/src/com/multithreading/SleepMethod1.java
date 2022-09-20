package com.multithreading;

public class SleepMethod1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("child thread");

		}
	}

	public static void main(String[] args) {

		SleepMethod1 s23 = new SleepMethod1();
		s23.start();
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
			System.out.println("main Thead");
		}
	}

}
