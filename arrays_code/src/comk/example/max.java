package comk.example;

public class max {

	public static void main(String[] args) {
		int[] a = { 1, 10, 5, 8, 78, 100 };
		int k = 6;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			if (i == k - 1) {
				System.out.println("kth smalest elementis :" + a[i]);
			}

		}

	}
}
