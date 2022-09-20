package com.example.arrays;

public class Del_element {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int del_num = 4;
		for (int i = 0; i < a.length; i++) {
			if (del_num == a[i])
			{
				for (int j = i; j < a.length - 1; j++) 
				{
					a[j] = a[j + 1];
				}
				break;
			}
		}
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
