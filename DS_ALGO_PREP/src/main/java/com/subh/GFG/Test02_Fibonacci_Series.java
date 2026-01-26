package com.subh.GFG;

import java.util.Scanner;

public class Test02_Fibonacci_Series {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
        int n = scn.nextInt();
        
        int [] fa = new int [n+1];
        
        fa[0] =1;
        fa[1] =1;
        
        for (int i=2;i<=n-1;i++) {
        	fa[i] = fa[i-2] + fa[i-1];
        }
       
        
        System.out.println(fa[n-1]);
        scn.close();
	}

}
