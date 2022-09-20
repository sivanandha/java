package com.example.strings;

public class Vowels_consonents {

	public static void main(String[] args) {
		int vcount = 0;
		int ccount = 0;
		String s = "this is my first string";
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') 
			{
				vcount++;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				ccount++;
			}
				

		}
		System.out.println(" vowels count:"+vcount);
		System.out.println(" consonents count:"+ccount);

	}

}
