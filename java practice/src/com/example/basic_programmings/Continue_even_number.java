package com.example.basic_programmings;

import java.util.Scanner;

public class Continue_even_number {

	public static void main(String[] args) {
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number:");
			int n=scan.nextInt();
			for(int i=0;i<=n;i++)
			if(i%2==1) 
				System.out.println(i);
				
			else
				continue;
			
			}

	}

}
