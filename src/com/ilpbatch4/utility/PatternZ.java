package com.ilpbatch4.utility;
 
public class PatternZ {
 
	public static void main(String[] args) {
		int rows = 5;
		zPattern(rows);
 
	}
 
	private static void zPattern(int rows) {
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= rows;j++)
			{
				if(i == 1 || i == rows || i + j == rows+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}
 
}