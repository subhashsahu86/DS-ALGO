package com.subh.practice;

import java.util.Scanner;

public class PailendromeNumber {
   
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
	 
		int num = scn.nextInt();
		int temp=num,rem,rev=0;
		
		while(temp>0) {
			rem=temp%10;
			rev = rev*10+rem;
			temp =temp/10;
		}
		if(num==rev) {
			System.out.println("Number is Pailandrome");
		}
		else
			System.out.println("Number is not Pailandrome");
		

		
	scn.close(); 	
}
	
}
