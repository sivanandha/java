package com.example;

public class Remove_White_spaces {

	public static void main(String[] args) {
		// Method 1
		String s = " chilla pothu malli naidu";
		String nospace = s.replaceAll("\\s", "");
		System.out.println(nospace);

		// method2
		char[] c = s.toCharArray();// coversted to string to array
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < c.length; i++) {
			if ((c[i] != ' ') && (c[i] != '\t')) {
				sb.append(c[i]);

			}
		}
		String nospace1 = sb.toString();
		System.out.println(nospace1);
	}

}
