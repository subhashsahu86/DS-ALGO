package com.subh.leetcode;

public class Prob09_isPalandromeNumber {
	
	/*
	 * public static boolean isPalandrome(int x) {
	 * 
	 * 
	 * }
	 */
	
	public static int i,j;
	
	public static void main(String[] args) {
		
	
		String num = "-121";
		 char[] ch =  num.toCharArray();
		 
		 for( i = 0; i<num.length();i++) {
		 System.out.println(ch[i]);
	
		 } 
		
		 
		 char [] ch2 = new char[num.length()];
		
		 for ( j=0;j<num.length();j++) {
			 ch2[j] = ch[i-1];
			 i--;
		 }
		 
		 
		 System.out.println(ch2);
		
	}

}
