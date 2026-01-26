package com.subh.practice.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SubStringLaxicographically {
	
	public static void main(String[] args) {
		String str ="welcometojava";
		int length=3;
	    System.out.println(getString(str,length));
	    System.out.println();
	    System.out.println(displaySubstrings(str, length));
	    System.out.println();
	    System.out.println(getSmallestAndLargest(str,length));
	    
	}
	
	//Approach :1 using List
	private static String getString(String str, int length) {
		
		List<String> subStrings = new ArrayList<>();
		
		
		
		for(int i=0; i<=str.length()-length;i++) {
			subStrings.add(str.substring(i, i+length));
		
		}
		
		Collections.sort(subStrings);

		String smallest =subStrings.get(0);
	   int last = subStrings.size();
	   String largest = subStrings.get(last-1);
	  
		return smallest+"\n"+largest;
	}
	//Approach :2 using String class only
	
	
	private static String displaySubstrings(String str , int length) {
		
		String smallest =str.substring(0, length);
		String largest =str.substring(0, length);
		
		for(int i=0; i<=str.length()-length; i++) {
			String currentString = str.substring(i, i+length);
			
			if(currentString.compareTo(smallest)<0) {
				smallest =currentString;
			}
			
			if(currentString.compareTo(largest)>0) {
				largest =currentString;
			}
		}
		
		return smallest+"\n"+largest;
	}
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = s.substring(0,k);
	        String largest = s.substring(0, k);
	        
	        String currenString;
	        for(int i=0; i<=s.length()-k;i++){
	            currenString = s.substring(i, i+k);
	            
	            if(currenString.compareTo(smallest)<0){
	                smallest =currenString;
	            }
	            
	            if(currenString.compareTo(largest)>0){
	                 largest = currenString;
	            }
	        }
	        
	        
	        return smallest + "\n" + largest;
	    }

}
