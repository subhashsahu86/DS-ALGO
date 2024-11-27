package com.subh.pattern;

import java.util.Scanner;

/*

*****
 ****
  ***
   **
    *
 */
public class Test08 {
   
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int n =scn.nextInt();
			printPattern(n);
			scn.close();
	}
	
	private static void printPattern(int n ) {
		
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(j>=i) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}