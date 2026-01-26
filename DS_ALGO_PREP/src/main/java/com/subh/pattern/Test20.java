package com.subh.pattern;

import java.util.Scanner;
/*
43210
3210 
210  
10   
0    

 */


public class Test20 {
	public static int i,j,k;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		
		for(i=1; i<=n; i++) {
			k=n-i;
			for(j=1; j<=n ; j++) {
				
				if(j<=n+1-i) {
					System.out.print(k);
				 k--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
 }

}