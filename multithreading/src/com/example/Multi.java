package com.example;
//Java Thread Example by extending Thread class
public class Multi extends Thread{
	public void run()
	{
		System.out.println("thread is running ...!!!!");
	}

	public static void main(String[] args) {
		Multi m=new Multi();
		m.start();
	}

}
