package comk.example;

import java.util.HashSet;

public class Common_elements_fromtwoarrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 5, 8, 10, 15 };
		int[] arr2 = { 3, 5, 7, 10, 15, 5 };
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) 
				{	
					hs.add(arr1[i]);
					break;
				}

			}
		}
		for (int no : hs) {
			System.out.println(no);
		}

	}

}
