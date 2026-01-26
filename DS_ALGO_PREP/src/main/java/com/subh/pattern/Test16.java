package com.subh.pattern;

import java.util.Scanner;
/*
123454321
1234-4321
123---321
12-----21
1-------1
 */

public class Test16 {
	  public static int i,j,k;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}
	
	public static void printPattern(int n) {
		
		for(int i=1;i<=n;i++){
		     k=1;
		      for(int j=1; j<=2*n-1; j++){
		   
		          if(j<=n+1-i || j>=n-1+i){
		       System.out.print(k);
		       if(j<n) {k++;}else {k--;}
		         }
		          else{
		           System.out.print("-");
		           if(j==5) {
		        	   k--;
		           }
		          }
		   }
		    System.out.println();
		}

	}

}
