package com.array;
//Single Dimensional Array
//public class TraverseArray {
//	public static void main(String[] args) {
//		int[] a = {11,32,23};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//	}
//}
// Two Dimensional Array
//public class TraverseArray {
//	public static void main(String[] args) {
//		int[][] a = {{11,32,23},{12,23,45}};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//			      System.out.print(a[i][j]+" ");
//		    }
//		    System.out.println();
//	    }
//    }  
//}
// Three Dimensional Array
//public class TraverseArray{
//	public static void main(String[] args) {
//		int[][][] a = {{{12,13,23,3},{10,21,12,12},{21,12,23,32}}};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				for(int k=0;k<a[i][j].length;k++) {
//					System.out.print(a[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//		}
//	}
//}

//Single Dimensional Array with While Loop

//public class TraverseArray{
//	public static void main(String[] args) {
//		int[] a = {10,21,22};
//		int i =0;
//		while(i<a.length)  {
//			System.out.print(a[i]+" ");
//			i++;
//		}
//	}
//}

// Single dimensional Array while Do While Loop\

public class TraverseArray{
	public static void main(String[] args) {
	int[] a = {12,13,45};
	int h=0;
	
	do {
		System.out.print(a[h]+" ");
		h++;
	}while(h<a.length);
}
}