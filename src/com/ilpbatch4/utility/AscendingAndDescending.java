package com.ilpbatch4.utility;
 
public class AscendingAndDescending {
 
	public static void main(String[] args) {
		int input1 = 10;
		int input2 = 20;
		int input3 = 40;
		int input4 = 2;
 
		numberDesc(input1, input2, input3, input4);
 
	}
 
	private static void numberDesc(int input1, int input2, int input3, int input4) {
		if (input1 <= input2 && input1 <= input3 && input1 <= input4) {
			System.out.println(input1 + " ");
			if (input2 <= input3 && input2 <= input4) {
				System.out.println(input2 + " ");
				if (input3 <= input4) {
					System.out.println(input3 + "");
					System.out.println(input4 + "");
				}
 
				else {
					System.out.println(input4 + "");
					System.out.println(input3 + "");
				}
 
			}
 
		}
		if (input2 <= input1 && input2 <= input3 && input2 <= input4) {
			System.out.println(input2 + " ");
			if (input1 <= input3 && input1 <= input4) {
				System.out.println(input1 + " ");
				if (input3 <= input4) {
					System.out.println(input3 + "");
					System.out.println(input4 + "");
				}
 
				else {
					System.out.println(input4 + "");
					System.out.println(input3 + "");
				}
 
			}
 
		}
		if (input3 <= input1 && input3 <= input2 && input3 <= input4) {
			System.out.println(input3 + " ");
			if (input1 <= input2 && input1 <= input4) {
				System.out.println(input1 + " ");
				if (input2 <= input4) {
					System.out.println(input2 + "");
					System.out.println(input4 + "");
				}
 
				else {
					System.out.println(input4 + "");
					System.out.println(input2 + "");
				}
 
			}
 
		}
		if (input4 <= input1 && input4 <= input2 && input4 <= input3) {
			System.out.println(input4 + " ");
			if (input1 <= input2 && input1 <= input3) {
				System.out.println(input1 + " ");
				if (input2 <= input3) {
					System.out.println(input2 + "");
					System.out.println(input3 + "");
				}
 
				else {
					System.out.println(input3 + "");
					System.out.println(input2 + "");
				}
 
			}
 
		}
 
	}
 
}	
