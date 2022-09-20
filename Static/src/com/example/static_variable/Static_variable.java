package com.example.static_variable;

class Demo {
	static int a = 10;
}

public class Static_variable {
 static int b=20;
	public static void main(String[] args) {
		
		//no need to create object for the class
		System.out.println(Demo.a);
		System.out.println(Static_variable.b);

	}

}
