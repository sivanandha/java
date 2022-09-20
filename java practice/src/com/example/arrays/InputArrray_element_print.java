package com.example.arrays;

import java.util.Scanner;

public class InputArrray_element_print {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the arrays elements");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		
		}

	}

}
