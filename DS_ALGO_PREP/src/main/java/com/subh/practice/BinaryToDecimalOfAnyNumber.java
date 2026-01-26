package com.subh.practice;

import java.util.Scanner;

public class BinaryToDecimalOfAnyNumber {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		
		String s = scn.next();
		char[] ch =s.toCharArray();
		int d=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='0') {
				d=d*2+0;
			}
			else{
				d=d*2+1;
			}
				
		}
	
	
		System.out.println("Decimal Number : "+d);
		scn.close();
	}

}
