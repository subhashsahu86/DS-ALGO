package com.subh.pattern;

import java.util.Scanner;
/*
        *
        **
        ***
        ****
        *****
*/
public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();
	}

	public static void printPattern(int n ) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
