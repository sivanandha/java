package com.example;

abstract class Student
{
	abstract void m1();
	
}
class Employee extends Student
{
	void m1()
	{
		System.out.println(" i am child1");
	}
	
}
class Employee1 extends Student
{
	void m1()
	{
		System.out.println(" i am child2");
	}
	
}
public class Showw {

	public static void main(String[] args) {
	Student e=new Employee();
	e.m1();
	Student e1=new Employee1();
	e1.m1();
	
	
		

	}

}
