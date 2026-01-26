package com.subh.practice.Arrays;

import java.util.Scanner;

public class Test01_2DArrays {
	
	static int rows;
	static int coloum;
	static int value=0;
	

	 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		rows=scn.nextInt();
		System.out.print("Enter the Number of Coloums : ");
		
		coloum=scn.nextInt();
		
		
		int[][] arr = new int[rows][coloum]	;
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0; j<coloum; j++) {
				arr[i][j]=value;
				value++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		scn.close();
	}

}
