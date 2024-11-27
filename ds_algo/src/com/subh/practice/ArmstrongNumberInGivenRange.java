package com.subh.practice;

import java.util.Scanner;

public class ArmstrongNumberInGivenRange {
	
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Lower Range Number : ");
		
		int low =scn.nextInt();
        
		System.out.print("Enter the Higher Range Number : ");
		int high = scn.nextInt();
		System.out.println("Armstrong Numbers  Between "+low + " and "+high+" are : " );
	
		getArmstrongNumber(low, high);
		
		scn.close();
	}

     public static void getArmstrongNumber(int low , int high) {
    	 
    	 for(int i=low; i<=high; i++) {
    		 int temp=i,sum=0,power=0,temp2=i,digit;
    		 
    		 while(temp!=0) {
    			 power++;
    			 temp=temp/10;
    		 }
    		 
    		 while(temp2!=0) {
    			 digit=temp2%10;
    			 sum=sum+(int)Math.pow(digit, power);
    			 temp2 /=10;	 
    			
    		 }
    		 if(sum==i) {
    			 System.out.print(sum+" ");
    		 }
    	 }
    	 
     }

}
