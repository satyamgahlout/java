package com.array;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		int[][][] a = {{{12,34,12,12,21},{23,34,34,45},{23,23,21}}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
		    }
			
		}
		
	}
}
