package com.arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] a = { 10, 50, 30, 50, 60, 84, 00, 100 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Ascending order is|::");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
