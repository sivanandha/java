package com.example.multithreading;

public class Current_thread  extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Current_thread c=new Current_thread();
		Current_thread c1=new Current_thread();
		c.start();
		c1.start();

	}

}
