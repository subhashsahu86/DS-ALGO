package com.subh.pattern;

import java.util.Scanner;
/*
    5    
   454   
  34543  
 2345432 
123454321

 */
public class Test13A {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();

	}

	public static void printPattern(int n) {

            for(int i=1; i<=n; i++){
			
			int k=1;
			for(int j=1; j<=2*n-1; j++){
				
				if(j>=n+1-i && j<=n-1+i){
					System.out.print(k);
				}else{
					System.out.print(" ");
				}
				if(j<n)
					k++;
				else
					k--;
				
			}
			System.out.println();
		}

	}

}