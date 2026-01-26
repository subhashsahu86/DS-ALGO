package com.subh.practice;

import java.util.Scanner;

public class PailendromeNumberUsingString {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		String orignal = scn.next().toLowerCase();
		 
		String reversed = new StringBuilder(orignal).reverse().toString();
		
		
		
		if(orignal.equals(reversed)) {
			System.out.println("Given Number is Pailendrome Number");
		}
		else
			System.out.println("Given Number is not a Pailendrome Number");
				
		
	}

}
