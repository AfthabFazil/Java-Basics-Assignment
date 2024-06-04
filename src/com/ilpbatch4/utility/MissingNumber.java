package com.ilpbatch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int array[] = {1,2,3};
		missingNumberArray( num,  array);
	}
	private static void missingNumberArray(int num, int[] array) {
		for(int i=0; i<num; i++) {
			for(int j=0; j<array.length; j++) {
				if(i==array[j]) {
					System.out.print(i + "is missing");
					break;
				}
			}
		}
	}

} 
