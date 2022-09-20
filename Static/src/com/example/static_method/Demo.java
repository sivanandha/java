package com.example.static_method;

public class Demo {

	static void show()
	{
		System.out.println(" i am static method");
	}
	void view()
	{
		System.out.println(" i am not static method");
	}
	public static void main(String[] args) {
		
		show();
		Demo d=new Demo();
		d.view();
		show();
		Demo.show();
	}

}
