package com.example;

abstract class Shape {
	abstract void draw();

}
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();

	}

}
