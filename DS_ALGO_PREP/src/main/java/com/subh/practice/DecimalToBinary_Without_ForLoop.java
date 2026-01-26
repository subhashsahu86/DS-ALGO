package com.subh.practice;

public class DecimalToBinary_Without_ForLoop {
  
	
	public static void main(String[] args) {
		
		String bNum ="";
		int decimal =17;
		//Approach : 1 direct-method
		System.out.println(Integer.toBinaryString(decimal));//Decimal to Binary
		System.out.println(Integer.toString(decimal, 2));//Decimal to Binary
		System.out.println(Integer.toString(decimal, 8));//Decimal to Ocatal
		System.out.println(Integer.toString(decimal, 16));//Decimal to hexaDecimal
		
		
		//Approach :2
		int rem;
		while(decimal>0) {
			rem = decimal%2;
			//to convert a integer value into String we use
			// Integer.toString(int i)
			bNum = Integer.toString(rem)+bNum;
			decimal = decimal /2;
		}
		
		System.out.print(bNum);
		
	
}
}
