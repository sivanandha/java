package com.example;

//2) Java Thread Example by implementing Runnable interface
public class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		Multi3 m = new Multi3();
		Thread t1 = new Thread(m);
		t1.start();

	}

}
