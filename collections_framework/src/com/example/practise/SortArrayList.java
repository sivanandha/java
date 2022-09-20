package com.example.practise;
//
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
// sorting list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		Collections.sort(list1);
		for(String fruits:list1)
		{
			System.out.println(fruits);
		}
		//sorting list numbers 
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		Collections.sort(list2);
		for(int no:list2)
		{
			System.out.println(no);
		}	
	
	}
}
