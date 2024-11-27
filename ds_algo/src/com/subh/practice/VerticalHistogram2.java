package com.subh.practice;
import java.util.Arrays;

public class VerticalHistogram2 {
	
	// Java program to make histogram of an array
	


	static void printHistogram(int[] arr, int n) {
		int maxEle = Arrays.stream(arr).max().getAsInt();
		for (int i = maxEle; i >= 0; i--) {
		System.out.format("%2d | ", i);
		
		// if array of element is greater
		// then array it print x
		for (int j = 0; j < n; j++) {
			if (arr[j] >= i) {
			System.out.print(" x ");
			} else {
			System.out.print(" ");
			}
		}
		System.out.println();
		}
		for (int i = 0; i < n + 3; i++) {
		System.out.print("---");
		}

		System.out.println();
		System.out.print("    ");

		for (int i = 0; i < n; i++) {
		System.out.print(" " + arr[i]+ " ");
		}
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = { 10, 9, 12, 4, 5, 2, 8, 5, 3, 1 };
		int n = arr.length;
		printHistogram(arr, n);
	}
	


}
