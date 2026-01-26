package com.subh.practice;

import java.util.Scanner;

public class Find_LCM_of_Two_Numbers {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first Number : ");
		int a=scn.nextInt();
		System.out.print("Enter the second Number : ");
		int b=scn.nextInt();
		
		findPrimeNumbers(a, b);
		
		scn.close();
	}
	
	private static void findPrimeNumbers(int a , int b) {
		
		int ans = (a>b) ? a : b;
		
		while(true) {
			if(ans%a==0 && ans%b==0)
				break;
			ans++;
		}
		System.out.println("LCM of "+a+" and "+b+" is : "+ans);
	}

}
