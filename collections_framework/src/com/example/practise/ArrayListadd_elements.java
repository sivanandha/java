package com.example.practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//ArrayList,list,LinkedList,Stack,Vector,HashSet,LinkedHashSet..
public class ArrayListadd_elements {

	public static void main(String[] args) {
		LinkedHashSet<String> a = new LinkedHashSet<String>();
		a.add("malli");
		a.add("hari");
		a.add("siva");
		a.add("rani");
		a.add("ooha");
		
    System.out.println("Array list values with out iteration print here: " + a);

// traversing iteration for Iterator
		System.out.println("traversing throgh iterator :");
		Iterator<String> itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//traversing through for_each loop
		System.out.println("traversing throgh for-each loop:");
		for (String names : a) {
			System.out.println(names);
		}
	}

}
