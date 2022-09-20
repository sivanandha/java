package com.example.basic_programmings;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a the number:");
		int a=scan.nextInt();
		System.out.println("enter b the number:");
		int b=scan.nextInt();
		
		System.out.println("Sapping before:"+a +" "+b);
		a=a+b;  //temp=a;
		b=a-b;   //a=b;
		a=a-b;    //b=temp;
		System.out.println("Sapping after:"+a +" "+b);
		

	}

}
