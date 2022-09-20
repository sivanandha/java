package com.example.multithreading;

public class Thread_priority  extends Thread{
	public void run()
	{
		System.out.println(" i am a thread:");
	}

	public static void main(String[] args) {
		Thread_priority t1=new Thread_priority();
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
