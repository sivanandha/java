package com.example.arrays;

import java.util.Arrays;

public class Arrays_equal_not {

	public static void main(String[] args) {
		int[] a= {5,10,15,1,63};
		int[] b= {5,10,15,1,6};
		if(Arrays.equals(a, b))
		
			System.out.println("two arrays are equal");
		else
			System.out.println("arrays are not equal");
		
	}

}
