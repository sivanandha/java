package com.example.arrays;

public class Avg_array {

	public static void main(String[] args) {
		int[] a= {5,10,15,1,63};
		int length=a.length;
		//int avg;
		int sum=0;
	
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
			int avg=sum/a.length;
			//System.out.print(a[i]+" ");

			System.out.println("sum of array:"+sum);
		
		System.out.println("avag of array:"+avg);
		
		
		//System.out.println();

	}

}
