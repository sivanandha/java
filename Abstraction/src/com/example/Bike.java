package com.example;

abstract class Bikee {
	abstract void run();

}

class Cbshine extends Bikee {
	void run() {
		System.out.println("running safly!!!!");
	}

}

public class Bike {
	public static void main(String args[]) {
		Cbshine c = new Cbshine();
		c.run();
	}
}
