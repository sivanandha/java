package com.example.collections;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
	 System.out.print(list);
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
