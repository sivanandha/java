package com.example;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(" child thread");
		}
	}
}

public class Mythread4 {

	public static void main(String[] args) {
		Mythread m = new Mythread();
		m.start();
		//main thread
		for (int i = 0; i < 5; i++) {

			System.out.println(" main thread");
		}

	}

}
