package com.example.static_variable;
//increment the values using count value
public class Static_count {

	static int count = 0;

	Static_count() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Static_count s1 = new Static_count();
		Static_count s2 = new Static_count();
		Static_count s3 = new Static_count();
	}

}
