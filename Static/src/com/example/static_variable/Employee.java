package com.example.static_variable;


public class Employee {
	int roll_no;
	String emp_name;
	String company="capgemini";
	
	public Employee(int roll_no, String emp_name) {
		super();
		this.roll_no = roll_no;
		this.emp_name = emp_name;
	}
	void display()
	{
		System.out.println(roll_no+" "+emp_name+" "+company);	
	}

	public static void main(String[] args) {
		Employee e=new Employee(1, "malli");
		Employee e1=new Employee(2, "siva");
		Employee e2=new Employee(3, "hari");
		
		e.display();
		e1.display();
		e2.display();
	}

}
