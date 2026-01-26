package com.subh.practice.String;

public class ReplaceSpecialCharacter {
	
	public static void main(String[] args) {
		String str = "$co%r@e*ja!va007";
		
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newStr);
	}

}
