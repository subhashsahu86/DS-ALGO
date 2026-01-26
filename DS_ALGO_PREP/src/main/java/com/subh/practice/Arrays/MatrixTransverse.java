package com.subh.practice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixTransverse {
	
	public static void main(String[] args) {
		List<List<Integer>> matrixList = new ArrayList<>();
		int rows =4;
		int colums=3;
		
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(10);
		firstRow.add(20);
		firstRow.add(30);
		
		List<Integer> secondRow = new ArrayList<>();
		secondRow.add(50);
		secondRow.add(70);
		secondRow.add(40);
		
		List<Integer> thirdRow = new ArrayList<>();
	    thirdRow.add(70);
		thirdRow.add(90);
		thirdRow.add(80);
		
		List<Integer> forthRow = new ArrayList<>();
	    forthRow.add(15);
		forthRow.add(30);
		forthRow.add(45);
		
		matrixList.add(firstRow);
		matrixList.add(secondRow);
		matrixList.add(thirdRow);
		matrixList.add(forthRow);
		
		System.out.println("Orignal Matrix :->");
		for(int i=0; i<rows;i++) {
			for(int j=0; j<colums;j++) {
			
			System.out.print(matrixList.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transverse Matrix :->");
		for(int i=0; i<colums;i++) {
			for(int j=0; j<rows;j++) {
			
			System.out.print(matrixList.get(j).get(i)+" ");
			}
			System.out.println();
		}
		
		
	}

}
