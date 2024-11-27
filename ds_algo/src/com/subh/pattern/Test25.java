package com.subh.pattern;

import java.util.Scanner;

public class Test25 {
	public static int i,j;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		
				for(i=1;i<=n;i++) {
					
					for(j=1; j<=2*n; j++) {
						if(j>=n+1-i && j<=2*n+1-i) {
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					System.out.println();
				}
 }

}