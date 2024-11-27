package com.subh.practice;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num =scn.nextInt();
		
		getArmstrongNumber(num);
		
		
		scn.close();
	}
	
	public static void getArmstrongNumber(int num) {
		
		int temp=num, digit=num, sum=0, power=0;
		
		
		
		while(temp!=0) {
			power++;
			temp /=10;
		}
		temp=num;
		while(temp!=0) {
			digit %= 10;
			sum =sum+ (int)Math.pow(digit, power); 
			temp /= 10;
			digit=temp;
		}
		
		if(sum==num) {
			System.out.println("Given Number is an Armstrong Number");
		
		}else {
			System.out.println("Given Number is not an Armstrong Number");
		}
			
			
	}

}
