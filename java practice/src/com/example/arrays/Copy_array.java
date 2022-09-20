package com.example.arrays;

public class Copy_array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		//System.out.println(b[i]+" ");

	}

}
