package com.subh.GFG;

import java.util.Scanner;

public class Test03_whileLoop {
	static int multiplier;
	static int n;
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n =  scn.nextInt();
		printTable(n);
		
		scn.close();
	}
	
	static void printTable(int n) {
		
		 multiplier = 10;
		
		while(multiplier>0) {
			int res = multiplier * n;
			multiplier--;
			System.out.print(res +" ");
		}
		
	}
}
