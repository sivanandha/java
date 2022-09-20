package com.multithreading;

public class GetThread {

	public static void main(String[] args) {
		Thread t = new Thread("this is my first Thread");
		String string = t.getName();
		System.out.println(string);

	}

}
