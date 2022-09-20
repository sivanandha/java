package com.example.arrays;
//3d arrays elements printing
public class ThreeDarray {

	public static void main(String[] args) {
		int[][][] a= {{{1,4},{6,7}},{{1,1},{6,9}}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
		
				
			System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}

	}
	}
}
