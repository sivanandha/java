package com.example.collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
	String name;
	int roll;
	static String college = "seat";

	public Arraylist1(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		Arraylist1 a1 = new Arraylist1("malli", 11);
		Arraylist1 a2 = new Arraylist1("rani", 12);
		Arraylist1 a3 = new Arraylist1("hari", 13);
		Arraylist1 a4 = new Arraylist1("siva", 14);

		List<Arraylist1> student = new ArrayList<>();
		student.add(a1);
		student.add(a2);
		student.add(a3);
		student.add(a4);
		/// hash se

		for (Arraylist1 a : student) {
			System.out.println(a.name + "" + a.roll + " " + a.college);
		}
	}

}
