package com.example.multithreading;

public class Demo  extends Thread{
	public void run()
	{
		System.out.println(" running:::::");
	}
	

	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo();
		d.start();
		System.out.println("name of t1"+d.getName());
		System.out.println("name of t2"+d1.getName());
    d.setName(" hello malli");
	System.out.println("name of t1::bollowyb"+d.getName());
	}

}
