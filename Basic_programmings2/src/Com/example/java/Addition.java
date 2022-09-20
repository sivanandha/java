package Com.example.java;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the a value:");
		int a = scan.nextInt();
		System.out.println("enter the b value:");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println(c);

	}

}
