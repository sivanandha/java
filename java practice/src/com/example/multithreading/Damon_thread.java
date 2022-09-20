package com.example.multithreading;

public class Damon_thread  extends Thread{
       public void run()
       {
    	   if(Thread.currentThread().isDaemon())
    	   {
    		   System.out.println("is a daemon Thread");
    	   }else 
    	   {
    		   System.out.println(" is a user thread");
    	   }
    	   
       }
	public static void main(String[] args) {
		Damon_thread d=new Damon_thread();
		Damon_thread d1=new Damon_thread();
		Damon_thread d2=new Damon_thread();
		d.setDaemon(true);
		d.start();
		d1.start();
		d2.start();

	}

}
