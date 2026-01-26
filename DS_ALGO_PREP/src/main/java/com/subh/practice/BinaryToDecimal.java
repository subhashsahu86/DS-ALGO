package com.subh.practice;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		int binaryNum=10101101;
		
	   while(binaryNum>0) {
		   sum = sum + (int)(binaryNum%10*Math.pow(2.0,i));
	
		   binaryNum=  binaryNum/10;
		   i++;
		   
	   }
	  
	  
	   System.out.println("Decimal Number : "+sum);
	   
		
		
	}

}
