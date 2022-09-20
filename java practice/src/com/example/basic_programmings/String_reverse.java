package com.example.basic_programmings;

import java.util.Scanner;

public class String_reverse {
	static String String_reve(String original)
	{
		String rev=" ";
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the reverse string:");
		String original=scan.nextLine();
		String_reverse.String_reve(original);
		

	}

}
