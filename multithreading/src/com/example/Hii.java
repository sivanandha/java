package com.example;

public class Hii extends Thread {
	public void run() {
		System.out.println("no arguments method");
	}

	public void run(int a) {
		System.out.println("arguments method");
	}

	public static void main(String[] args) {
		Thread obj = new Hii();

		obj.start();
	}
}
