package com.example.arrays;

public class Ascending_order {

	public static void main(String[] args) {
		int[] a= {5,10,15,1,63};
		int length=a.length;
		System.out.print("before Acending:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
		
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}			
			}
	}
		System.out.print("after Acending: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
