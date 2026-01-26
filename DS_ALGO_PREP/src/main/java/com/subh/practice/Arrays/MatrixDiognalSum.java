package com.subh.practice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiognalSum {
	
	public static void main(String[] args) {
		int rows=3;
		int columns =3;
		List<List<Integer>> students = new ArrayList<>();
		
		
			ArrayList<Integer> class1 = new ArrayList<>();
		    class1.add(50);
		    class1.add(40);
		    class1.add(90);
		    
		    ArrayList<Integer> class2 = new ArrayList<>();
		    class2.add(30);
		    class2.add(25);
		    class2.add(55);
		    
		    ArrayList<Integer> class3 = new ArrayList<>();
		    class3.add(45);
		    class3.add(35);
		    class3.add(80);
		    
		    students.add(class1);
		    students.add(class2);
		    students.add(class3);
		    
		    for(int i=0;i<rows;i++) {
		    	for(int j=0;j<columns;j++) {
		    		System.out.print(students.get(i).get(j)+" ");
		    	}
		    	System.out.println();
		    }
		    //left diognal numbers
		    int leftDiognalSum=0;
		    int rightDiognalSum=0;
		    int temp=rows-1;
		    for(int k=0;k<rows;k++) {
		    	
		    	leftDiognalSum+=students.get(k).get(k);
		    	 rightDiognalSum+=students.get(k).get(temp);
		    	 temp--;
		    }
		   
		    int result = Math.abs(leftDiognalSum-rightDiognalSum);
		    System.out.println("Difference of the Diognals : "+result);
	}

}
