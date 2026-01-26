package com.subh.pattern;

import java.util.Scanner;
/*
    1
   12
  123
 1234
12345
 1234
  123
   12
    1

 */
public class Test21 {
	public static int i,j,k,x;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	private static void printPattern(int n ) {
		k=n+1;
		for(i=1; i<=2*n-1; i++) {
			x=1;
			if(i>n) {k++;}
			else {k--;}
			for(j=1; j<=n ; j++) {
				
				if(j>=k) {
					System.out.print(x);
					x++;
			
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
 }

}