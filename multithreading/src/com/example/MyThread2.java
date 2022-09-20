package com.example;

public class MyThread2 implements Runnable{
	public void run()
	{
		System.out.println(" thread is running");
	}

	public static void main(String[] args) {
	Runnable r=new MyThread2();
	Thread t=new Thread(r,"new thread");
	t.start();
	String s=t.getName();
	System.out.println(s);
	

	}

}
