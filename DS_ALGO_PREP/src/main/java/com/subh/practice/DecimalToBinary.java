package com.subh.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Decimal Number : ");
	    int  decimal =scn.nextInt();
	    
        printDtoB(decimal);
        
        DtoB(decimal);
        
        scn.close();
	}
	
	private static void printDtoB(int num) {
		List<Integer> al = new ArrayList<>();
		int temp=num;
		while(temp>0) {
	    int reminder = temp%2;
	    temp=temp/2;
	    al.add(reminder);
		}
		
	  for(int i : al) {
		  System.out.print(i);
	  }
	}
	
	private static void DtoB(int num){
		int temp = num;
        int rem;
		String s="";
		while(temp>0){
		rem = temp%2;
		temp=temp/2;
		s = rem + s;
		}
		System.out.println("result : " + s);
		
	}


}
