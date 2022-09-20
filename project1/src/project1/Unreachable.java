package project1;

public class Unreachable {

	public static void main(String[] args) {
		try {
			int a = 100 / 0;
		} catch (ArithmeticException e1) {
			System.out.println("arthemetic exception");
		} catch (Exception e) {
			System.out.println("rani");
		}

	}

}
