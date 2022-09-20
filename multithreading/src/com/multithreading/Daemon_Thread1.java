package com.multithreading;

public class Daemon_Thread1 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("daemon Thread work");

		} else {
			System.out.println("user thread works");
		}
	}

	public static void main(String[] args) {
		Daemon_Thread1 d1 = new Daemon_Thread1();
		Daemon_Thread1 d2 = new Daemon_Thread1();
		Daemon_Thread1 d3 = new Daemon_Thread1();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();

	}

}
