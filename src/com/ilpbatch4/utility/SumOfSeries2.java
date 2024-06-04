package com.ilpbatch4.utility;
import java.lang.Math;

public class SumOfSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fibonacciSeries(n);
		
	}
	private static void fibonacciSeries(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int sum=0;
		for (int i=2; i<n; i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			sum = sum + (int)Math.pow(n3, 3);
//			System.out.print(sum);
			
		}
		System.out.print(sum);
	}
}
