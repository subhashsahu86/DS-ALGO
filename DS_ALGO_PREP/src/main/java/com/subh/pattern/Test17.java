package com.subh.pattern;

import java.util.Scanner;
/*
*    
**   
***  
**** 
*****
**** 
***  
**   
*    
 */
public class Test17 {
	public static int i,j,k=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n) {
		
		for(i=1; i<=2*n-1; i++) {
		 if(i<=n) {
			 k++;
		 }
		 else {
			 k--;
		 }
			for(j=1; j<=n; j++) {
				
				if(j<=k) {
					System.out.print("*");
					
				   
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}

}
