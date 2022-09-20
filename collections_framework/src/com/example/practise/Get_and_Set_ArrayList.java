package com.example.practise;

import java.util.ArrayList;

public class Get_and_Set_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("banana");
		al.add("cheries");
		al.add("graps");
		al.add("mango");
		System.out.println("Array list values with out iteration print here: " + al);

		// get the graps from fruits

		System.out.println(" Retriving fruit is: " + al.get(3));
		
		// set the boppaya in 2 nd palce in list
		al.set(2, "boppaya");
		System.out.println("after set boppaya in arraylist/fruits:" + al);
		// traversing the al
		System.out.println("After iterating the elements: ");
		for (String fruits : al) {
			System.out.println(fruits);
		}

	}

}
