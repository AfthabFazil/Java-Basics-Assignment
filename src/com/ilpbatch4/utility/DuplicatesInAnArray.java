package com.ilpbatch4.utility;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arrayDuplicates();
		findArrayDuplicates();
	}
	
	private static void findArrayDuplicates() {
		int array[] = {1,21,2,4,7,4,2,2,7,4,21,9};
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}
	
//	private static void arrayDuplicates() { 
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
//        System.out.println("Duplicate elements in given array: ");  
//        for(int i = 0; i < arr.length; i++) {  
//            for(int j = i + 1; j < arr.length; j++) {  
//                if(arr[i] == arr[j])  
//                    System.out.println(arr[j]);  
//            }  
//        }  
//	}
}
