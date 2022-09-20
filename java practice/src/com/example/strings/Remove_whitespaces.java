package com.example.strings;

public class Remove_whitespaces {

	public static void main(String[] args) {
		String s = " chilla pothu malli naidu ";
		String s11 = s.replaceAll("\\s", "");
		System.out.println(s11);

		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if ((c[i] != ' ') && (c[i] != '\t')) {
				sb.append(c[i]);

			}
		}
		String nospace1 = sb.toString();
		System.out.println(nospace1);

	}

}
