package com.ilpbatch4.utility;

public class SumOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfPairs();
	}
	
	private static void sumOfPairs() {
		int array[] = {1,5,3,6,3,8,10};
		int sum=9;
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]+array[j]==sum) {
					System.out.println("Pairs are: "+array[i]+ " and "+array[j]);
				}
			}
		}
	}
}
