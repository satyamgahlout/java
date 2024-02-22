package com.array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] a = {{12,23,45,19,18},{32,31},{23,34,54}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
}
}
