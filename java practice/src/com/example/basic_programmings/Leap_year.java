package com.example.basic_programmings;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year:");
		int year=scan.nextInt();
		if(year/400==0)
		{
			System.out.println("leap year"+year);
		}else if(year%100==0)
		{
			System.out.println(" not leap year"+year);
		}else if(year%4==0)
		{
			System.out.println("leap year"+year);
		}else
		{
			System.out.println(" not leap year"+year);
		}
		

	}
	}
}
