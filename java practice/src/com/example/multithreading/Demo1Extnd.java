package com.example.multithreading;

public class Demo1Extnd extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1500);
				System.out.println(i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Demo1Extnd d = new Demo1Extnd();
		Demo1Extnd d1 = new Demo1Extnd();
		d.start();
		try {
			d.join();
		} catch (Exception e) {
			System.out.println(e);

		}
		d1.start();

	}
}
