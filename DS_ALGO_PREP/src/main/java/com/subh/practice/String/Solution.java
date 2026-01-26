package com.subh.practice.String;

import java.util.Scanner;

public class Solution {
static int breadth;
static int height;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    }
    
   // private static int findArea(int bredath, int height) throws Exception{
       static{ 
    	   
    	   Scanner scn = new Scanner(System.in);
           System.out.print("Enter breadth : ");
           breadth = scn.nextInt();
           System.out.print("Enter height : ");
            height  = scn.nextInt();
           
    	   
    	   try
       {
          System.out.println( findArea(breadth, height));
           }catch(Exception e){
              System.out.println( e.getMessage());
           }
           
    }
    
    public static int findArea(int breadth, int height) throws Exception{
        int area ;
        
    
        if(breadth<0 || height<0){
            throw new Exception("Breadth and height must be positive");
        }
       
       area = breadth *height;
         return  area;
      
    }
}
