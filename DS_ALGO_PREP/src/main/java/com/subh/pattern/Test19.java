package com.subh.pattern;

import java.util.Scanner;
/*
    1    
   234   
  34545  
 4545454 
545454545

 */
public class Test19 {
	public static int i,j,k;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		
		for( i=1; i<=n; i++) {
			k=i;
			for( j=1; j<=2*n-1; j++) {
				
				if(j>=n+1-i && j<=n-1+i) {
					System.out.print(k);
					if(k<n) {k++;} else {k--;}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
