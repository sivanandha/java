
package com.example;

public class TestSleepMethod2 {

	public static void main(String[] args) {
		try {  
			for (int j = 0; j < 10; j++)  
			{  
			  
			// The main thread sleeps for the 1000 milliseconds, which is 1 sec  
			// whenever the loop runs  
			Thread.sleep(1000);  
			  
			// displaying the value of the variable  
			System.out.println(j);  
			}  
			}  
			catch (Exception expn)   
			{  
			// catching the exception  
			System.out.println(expn);  
			}  

	}

}
