package project1;

public class Exception10 {

	public static void main(String[] args) {
		try {
			int a = 100 / 0;
			try {
				String string = null;
			} catch (NullPointerException e1) {
				System.out.println(e1);
			}
		} catch (ArithmeticException e2) {
			System.out.println(e2);
		}

	}

}
