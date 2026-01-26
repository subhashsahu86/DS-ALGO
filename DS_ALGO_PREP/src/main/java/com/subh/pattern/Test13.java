package com.subh.pattern;

import java.util.Scanner;
/*
    1    
   121   
  12321  
 1234321 
123454321
 */
public class Test13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}

	public static void printPattern(int n) {

          for(int i=1; i<=n; i++){
			
			int k=0;
			for(int j=1; j<=2*n-1; j++){
				
				if(j>=n+1-i && j<=n-1+i){
					if(j<=n)
					k++;
				else
					k--;
				
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}