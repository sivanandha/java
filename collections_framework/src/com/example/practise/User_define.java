package com.example.practise;

import java.util.ArrayList;

class Student
{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
public class User_define {

	public static void main(String[] args) {
		Student s1=new Student(1,"malli",25);
		Student s2=new Student(2,"siva",11);
		Student s3=new Student(3,"hari",25);
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		for(Student stu:s)
		{
			System.out.println(stu.rollno+" "+stu.name+" "+stu.age);
		}
	}

}
