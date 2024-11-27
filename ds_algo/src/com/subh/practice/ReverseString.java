package com.subh.practice;

class ReverseString {
	public static void main(String[] args) {
		System.out.println("Reverse the String of words :->>>>>");
		String s1 ="How Are You";
		
		String [] sa1 = s1.split("\\s");

		for(int i=sa1.length-1;i>=0;i--){
		System.out.print(sa1[i]+" ");
		}
		System.out.println();
		
    System.out.println("find the dublicate word in a string :->>>>");
       
	   String s2 ="How Are You How You";

	   String [] sa2 = s2.split("\\s");

	   

	   for(int i=0; i<sa2.length;i++){
		   
		for( int j=i+1;j<sa2.length;j++){
	      	if(sa2[i].equals(sa2[j])){
		      System.out.println("Dublicate found : "+sa2[i]); 
		}
	   }
	   }



	}
}



