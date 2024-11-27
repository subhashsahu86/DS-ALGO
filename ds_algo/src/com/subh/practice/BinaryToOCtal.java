package com.subh.practice;

import java.util.Scanner;

public class BinaryToOCtal {
	static int num=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		String bNo = scn.next();
		
		// binary to decimal
		char[] ch = bNo.toCharArray();
	       
	     for(int i =0; i<ch.length; i++) {
		if(ch[i]=='0') {
			num =num*2+0;
		}
		else
			num=num*2+1;
	     }
	     System.out.println("Decimal Number : "+num);
	
	//decimal to Octal
	String octalNum = Integer.toOctalString(num);
	System.out.println("Octal Number : "+octalNum);
			
	//decimal to Hexadecimal
	String hdNum = Integer.toHexString(num);
	System.out.println("HexaDecimal Number : "+hdNum);
	}
}
