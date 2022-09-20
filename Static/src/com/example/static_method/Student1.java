package com.example.static_method;

public class Student1 {
	String name;
	int age;
	static String home_town = "kalakada";

	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(name + " " + age + " " + " " + home_town);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1("malli", 25);
		Student1 s2 = new Student1("siva", 25);
		s1.display();
		s2.display();
	}

}
