package com.subh.pattern;

import java.util.Scanner;

/*
    *    
   * *   
  * * *  
 * * * * 
* * * * *

 */

public class Test11 {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int n =scn.nextInt();
			printPattern(n);
			scn.close();
			
	}
	
	private static void printPattern(int n) {
		 boolean temp = true;
		
		for(int i=1;i<=n;i++) { //printing rows
			
			for(int j=1;j<=2*n-1;j++) {
				
				if(j>=n+1-i && j<=n-1+i && temp==true) {
					System.out.print("*");
					temp = false;
				}
				else {
					System.out.print(" ");
				temp=true;
				}
			}
			System.out.println();
		}
	}

}
