package com.example;

// Using the Thread Class: Thread(String Name)
public class MyThread1 {

	public static void main(String[] args) {
		Thread t = new Thread("malli first thread...");
		t.start();

		// get the thread
		String s = t.getName();
		System.out.println(s);

	}

}
