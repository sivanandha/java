package Com.example.java;

import java.util.Scanner;

public class String_reverce {
	String rever(String ori) {
		String rev = " ";
		int length = ori.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + ori.charAt(i);
		}
		System.out.println(rev);
		return rev;
	}
	public static void main(String[] args) {
		String_reverce s = new String_reverce();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String ori = scan.nextLine();
		s.rever(ori);
	}
}
