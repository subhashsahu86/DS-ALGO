package com.subh.practice.String;

//Problem : compare two Strings without using pre-defined method
public class CompareTwoString {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
	     System.out.println(compareStrings(s1, s2));
	}
	
	private static int compareStrings(String str1 , String str2) {
		int minLength = Math.min(str1.length(),str2.length());
		
		if(str1.length()==str2.length()) {
		
			for(int i=0;i<minLength;i++) {
			
				if(str1.charAt(i) != str2.charAt(i)) {
				return str1.charAt(i)-str2.charAt(i);
			}
		}
		
		return 0;
		}else
			return -1;
		
	}
}
