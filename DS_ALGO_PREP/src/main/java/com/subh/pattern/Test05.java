package com.subh.pattern;

import java.util.Scanner;

/*
    *
   ***
  *****
 *******
*********
*********
 ******* 
  *****  
   ***   
    *    
 
 */

public class Test05 {
	public static int temp;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =scn.nextInt();
		printPattern(n);
		scn.close();
		
	}
	
	public static void printPattern(int n) {
		temp = n;
		// for no of rows
		for(int i=0;i<n;i++) {
			
			//for space
			for(int j=1;j<temp;j++) {
				System.out.print(" ");
			}
			temp--;
			//for star
			for(int k=1;k<=2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		temp=n;
		
          for(int i=1;i<=n;i++) {
			
			//for space
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
		
			//for star
			for(int k=1; k<=2*temp-1;k++) {
				System.out.print("*");
			}
			temp--;
			//for space
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
		
			System.out.println();
		}
	}

}
