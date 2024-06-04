package com.ilpbatch4.utility;
 
public class SumOfSeries4 {
 
	public static void main(String[] args) {
		int input1 =4;
		sumOfFactorialOfNumber(input1);
	}
 
	private static void sumOfFactorialOfNumber(int input1) {
		int ans = 1;
		float ans2 = 0;
		for(int i=1;i<=input1;i++)
		{			
			ans = ans*i;
			ans2= ans2+(i/ans);			
		}
		System.out.println("answer = "+ ans2);		
	} 
}