package inheritance;

class A {
	void m1()

	{
		System.out.println(" i am method 1");
	}

	void m2() {
		System.out.println(" i am method 2");
	}
}

public class Demo1 extends A {
	void m3() {
		System.out.println(" i am method 3");
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1();
		d.m2();
		d.m3();
	}
}
