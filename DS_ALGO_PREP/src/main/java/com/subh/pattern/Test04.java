package com.subh.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04 {
	
	/*
	     *********
          ******* 
           *****  
            ***   
             *         
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
			
			//for space
			for( j=1;j<i;j++) {
				System.out.print(" ");
			}
		
			//for star
			for( k=1; k<=2*temp-1;k++) {
				System.out.print("*");
			}
			temp--;
			//for space
			for( j=1;j<i;j++) {
				System.out.print(" ");
			}
		
			System.out.println();
			
		}
	}

}
