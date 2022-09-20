package com.example;
//cant strat the thread twice
public class TestThreadTwice1 {
	public void run(){  
		   System.out.println("running...");  
		 }  

	public static void main(String[] args)throws IllegalThreadStateException 
	{
		TestThreadTwice1 t1=new TestThreadTwice1();  
		//  t1.start();  
		 // t1.start();  

	}

}
