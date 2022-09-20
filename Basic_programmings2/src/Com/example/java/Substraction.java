package Com.example.java;

import java.util.Scanner;

public class Substraction {
	int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("substraction a,b is:"+c);
		return c;
		
	}

	public static void main(String[] args) {
		Substraction s=new Substraction();
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=scan.nextInt();
		System.out.println(" enter the b value:");
		int b=scan.nextInt();
		s.sub(a, b);
		}		

	}


