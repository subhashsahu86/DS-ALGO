package com.subh.pattern;

import java.util.Scanner;

public class Test26 {
	public static int i,j;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		char ch;
		for(i=1; i<=n; i++) {
			ch='A';
		
			for(j=1; j<=2*n; j++) {
				
				if(j>=n+1-i && j<=n+i) {
					if(j<=n) {
					System.out.print(ch);
					ch++;
					}
					else {
						ch='1';
						System.out.print(i);
					}
					/*
					 * if(j<=n) { ch++; } if(j==n) { ch='1';
					 * 
					 * }
					 */
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
 }

}