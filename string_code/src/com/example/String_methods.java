package com.example;

public class String_methods {

	public static void main(String[] args) {
		String s="Mallaiah";
		String s1= new String("MALLAIAH");
		String s2 = "   chilla pothu malli naidu   ";
		
		//sTRING METHODS
		//to uppercase
		String s11=s.toUpperCase();
		System.out.println("String covert to uppercase:"+s11);
		
		//to lower case
		String s22=s1.toLowerCase();
		System.out.println("String covert to lowercase:"+s22);
		
		//to remove white spaces
		String s33=s2.replaceAll("\\s", "");
		System.out.println(s33);
		
		//trim is used to remove white spaces beggining and ending of the string
		String s44=s2.trim();
		System.out.println(s44);
		
		//cancat
		String s55=s.concat("chillapothu");
		System.out.println(s55);
		
		//indexOf
		int s66=s.indexOf("a");
		System.out.println(s66);

	}

}
