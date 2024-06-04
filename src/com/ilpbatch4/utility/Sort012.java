package com.ilpbatch4.utility;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortZeroOneTwo();

	}
	private static void sortZeroOneTwo() {
		int arr[] = {1,2,0,0,2,1,0};
		int sorted[] = new int[7];
		int k=0;
		for (int i=0; i<=2;i++) {
			for (int j=0; j<arr.length;j++) {
				if (i==arr[j]) {
					sorted[k++]= arr[j];
				}
			}
		}
		for (int j=0; j<sorted.length;j++)
			System.out.print(sorted[j]+" ");
	}
}
