package com.subh.GFG;

import java.util.ArrayList;
import java.util.List;

public class Test01_switchCase {

	 public static void main(String[] args) {
		System.out.println(findWeekDay(9));
		List<Double> arr = new ArrayList<>();
		arr.add(5.0);
		System.out.println(arr);
		System.out.println(arr.get(0));
		
		System.out.println(switchCase(1, arr));
	}
	 
	 public static String findWeekDay(int num) {
		 
		 switch (num) {
		 case 1 : 
			 return "Monday";
			
		 case 2 :
			 return "Tuesday";
			 
		 case 3 :
			 return "Wednesday";
			
		 case 4 :
			 return "Thursday";
		 case 5 :
			 return "Friday";
		 case 6 :
			 return "Saturday";
		 case 7 :
			 return "Sunday";
	     default :
	    	 return " Please pass valid Number";
		 }
	 }

		static double switchCase(int choice, List<Double> arr){
	        double result = 0.0;
	        switch (choice) {
	        case 1 :
	             if(arr.size()>=1) {
	            	 double radius = arr.get(0);
	             double areaOfCircle =  Math.PI * (radius*radius);
	             
	             result = areaOfCircle;
	             break;
	             
	             }
	            
	        case 2 :
	        	if(arr.size()>=2) {
	        		double length = arr.get(0);
	        		double hight = arr.get(1);
	        	
	            double areaOfRectangle =  length * hight;
	            
	            result = areaOfRectangle;
	        	}
	        default :
	        	System.out.println("please pass valid choice");
	        } 
		return result;	
	    }
}
