package com.subh.practice;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("How many Numbers you want to add : ");
		
		//Approach :1 using Array
		int numbers = scn.nextInt();
		int [] arr = new int[numbers];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+" Number : ");
			int number=scn.nextInt();
			arr[i]=number;
			sum=sum+arr[i];
		}
		System.out.println("Result : "+sum);
		
		//Approach : 2 using for loop 
		System.out.print("How many Numbers you want to add : ");
		int count = scn.nextInt();
		sum =0;
		for(int i=1;i<=count;i++) {
			System.out.print("Enter the "+i+ " number : ");
			int num=scn.nextInt();
			sum = sum+num;
		}
		System.out.println("Result : "+ sum);
		System.out.println("Avg of the Numbers : "+ sum/count);
		
		
		
		
		
		scn.close();
	}

}
