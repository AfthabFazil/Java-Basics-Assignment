package com.ilpbatch4.utility;
import java.lang.Math;
 
public class SumOfSeries3 {
 
	public static void main(String[] args) {
		int n = 3;
		sumOfSeriesCube(n);
	}
 
	private static void sumOfSeriesCube(int n) {
		int j = 1, sum = 0; 
		for (int i = 0; i < n; i++) { 
			if ((i % 2) == 0) {				
				sum = sum +  (int) (Math.pow(j,(i+1)));				
			} else {
				sum = sum -  (int) (Math.pow(j,(i+1)));
			}
			j = j + 2;
		}
		System.out.print("Sum of series : " + sum);
	}
}