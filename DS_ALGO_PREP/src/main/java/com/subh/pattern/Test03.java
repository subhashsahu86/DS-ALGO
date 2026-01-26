package com.subh.pattern;

import java.util.Scanner;

public class Test03 {
	
	/*
	          *
             ***
            *****
           *******
          *********
	  
	 */
	
	public static int i,j,k,temp;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =scn.nextInt();
		printPattern(n);
		scn.close();
	}
	
	public static void printPattern(int n) {
		temp=n;
		for( i=1;i<=n;i++) {
			
			for( j=temp-1;j>0;j--) {
				System.out.print(" ");
			}
			temp--;
			for( k=1; k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
