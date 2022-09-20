package com.example;

abstract class Vechile {

	abstract void start();

}

class Scooter extends Vechile {
	void start() {
		System.out.println(" scooter start with key");
	}
}

class Car extends Vechile {
	void start() {
		System.out.println(" car start with key");
	}
}

public class Demo {

	public static void main(String[] args) {
		Scooter s = new Scooter();
		s.start();
		Car c = new Car();
		c.start();
	}
}
