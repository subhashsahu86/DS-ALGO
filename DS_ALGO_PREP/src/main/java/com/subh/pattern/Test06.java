package com.subh.pattern;

import java.util.Scanner;

public class Test06 {
	
/*

*    
**   
***  
**** 
*****
	 
*/
	
 public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =scn.nextInt();
		printPattern(n);
		scn.close();
		
}
  public static void printPattern(int n) {
	  //for no of rows
	  for(int i=0;i<n;i++) {
		  
		  //for no of coloum
		  for(int j =0;j<n;j++) {
			  if(j<=i) {
				  System.out.print("*");
			  }
			  else
				  System.out.print(" ");
		  }
		  System.out.println();
		 
	  }
	  
  }
 
}
