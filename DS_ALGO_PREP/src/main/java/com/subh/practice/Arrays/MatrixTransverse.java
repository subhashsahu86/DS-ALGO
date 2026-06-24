package com.subh.practice.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixTransverse {
	
	public static void main(String[] args) {
		List<List<Integer>> matrixList = new ArrayList<>();
		int rows =3;
		int colums=3;
		
		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		firstRow.add(2);
		firstRow.add(3);
		
		List<Integer> secondRow = new ArrayList<>();
		secondRow.add(4);
		secondRow.add(5);
		secondRow.add(6);
		
		List<Integer> thirdRow = new ArrayList<>();
	    thirdRow.add(7);
		thirdRow.add(8);
		thirdRow.add(9);
		
		/*List<Integer> forthRow = new ArrayList<>();
	    forthRow.add(15);
		forthRow.add(30);
		forthRow.add(45);*/
		
		matrixList.add(firstRow);
		matrixList.add(secondRow);
		matrixList.add(thirdRow);
	//	matrixList.add(forthRow);
		
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
