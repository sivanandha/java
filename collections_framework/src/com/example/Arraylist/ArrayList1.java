package com.example.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		arrayList.add("mallaiah");
		arrayList.add("sivanandha");
		arrayList.add("lucky");
		System.out.println(arrayList);
		Iterator itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
