package com.example.arrays;

import java.util.HashSet;

public class Common_elements {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {2,3,7,8,9};
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					hs.add(a[i]);
					break;
				}
			}
		}
		for(int no:hs)
		{
			System.out.println(no);
		}

	}

}
