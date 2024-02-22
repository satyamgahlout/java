package com.array;

public class AnonymousArray {
	public static void main(String[] args) {
		AnonymousArray.show(new int[]{21,23,12});
	}
    static void show(int [] no) {
    	int total =0;
    	for(int i:no) {
    		total = total+i;
    	}
    	System.out.print(total);
    }
}
