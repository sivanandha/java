package com.example;

//Example of an abstract class that has abstract and non-abstract methods  
abstract class Byke {
	Byke() {   //constractor
		System.out.println("bike is created");
	}

	abstract void run();// abstract method

	void changeGear() {  //non abstract method 
		System.out.println("gear changed");
	}
}
//Creating a Child class which inherits Abstract class  
class Honda extends Byke {
	void run() {
		System.out.println("running safely..");
	}
}
//Creating a Test class which calls abstract and non-abstract methods 
public class TestAbstraction2 {

	public static void main(String[] args) {
		Byke obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}
