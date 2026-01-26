package com.subh.practice;

import java.util.Arrays;


public class VerticalHistogramMain {
	
	public static void main(String[] args) {
	//	Scanner scn = new Scanner(System.in);
	//	System.out.println("Enter the elements ");
		int[] arr = {3,1,5,9,2,7};
	   printHistogram(arr);
	   
	 // int maxEle = Arrays.stream(arr).max().getAsInt();
	  
		
	}
	
	public static void printHistogram(int[] arr) {
	       int max=0;
		//find the max element of array
		for(int num : arr) {
			
			if(num>max) {
				max=num;
				
			}
		}
		
		//Arrays.sort(arr);
		//int max = arr[arr.length-1];
		
		//outer loop for y-axis
		for(int i=max ; i>0; i--) {
			
			//inner for loop for printing "*" and " "
			for(int j=0; j<arr.length; j++) {
				
				if(arr[j]>=i) {
					System.out.print(" * ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		//for loop for print base
		for(int k =0;k<=arr.length;k++) {
			System.out.print("---");
		}
		System.out.println();
		
		//for loop for print the x-axis numbers
		for(int l=0;l<arr.length;l++) {
			System.out.print(" "+arr[l]+" ");
		}
	}

}
