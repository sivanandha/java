package com.example;

import java.util.Arrays;

public class CountString {

	public static void main(String[] args) {
		
		String str = "we to java tu o Java2blog";
		 
        int word= 1;
      
 
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                word++;
             
                System.out.println(word);
            }
         System.out.println("Number of words in a string : " + word); 
        }
        System.out.println("Number of words in a string : " + word);
     
        
     

       
        
}
}
