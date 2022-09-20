package com.example.strings;

public class String_methods {

	public static void main(String[] args) {
		String s = "mallaiah";
		String s1 = new String(" chillapothu siva nandha ");
		char[] c = { 'j', 'a', 'v', 'a' };
		String s2 = new String(c);
		String s3="MALLAIAH";
		//sTRING METHODS
	//upper case conversion
		String s11=s.toUpperCase();
		System.out.println("upper case conversion: "+s11);
		
      // string lower case
		String s22=s3.toLowerCase();
		System.out.println("lower case conversion: "+s22);
		
		 // remove white spacess

		String s33=s1.replaceAll("\\s","");
		System.out.println("remove white spcaes : "+s33);
		
		 // remove white spacess

		String s44=s1.trim();
		System.out.println("remove white spcaes of begging and ending : "+s44);
		
		//
		String s55=s2.concat("programming");
		System.out.println(s55);
		
		int s66=s.indexOf("h");
		System.out.println(s66);
	}

}
