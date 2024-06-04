package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		sumOfSeries(num);
	}
	
	private static void sumOfSeries(int num) {
		
		int sum=0;
		int n=1;
		for (int i=0; i<num; i++) {
			if(i%2==0) {
				sum=sum+n;
			}
			else {
				sum=sum-n;
			}	
			
			n=n+2;
		}
		System.out.print(sum); 
	}

}
