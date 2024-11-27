package com.subh.pattern;

import java.util.Scanner;

public class Test23 {
	public static int i,j,k;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		k=0;
		for(i=1; i<=2*n-1; i++) {
			if(i<=n) {k++;}else {k--;}
			for(j=1; j<=2*n-1; j++) {
				
				if(j<=n+1-k || j>=n-1+k) {
					System.out.print("*");
				
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
 }

}