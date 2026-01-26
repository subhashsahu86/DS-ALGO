package com.subh.practice;

import java.util.Arrays;

public class VerticalHistogram {
    public static void main(String[] args) {
        int[] data = {3, 5, 8, 7, 4,10,18};

        // Step 1: Find the maximum value in the data array
       /* int max = 0;
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }*/
      
        // Arrays.sort(data);
         
        //int max = data[data.length-1];
        
         int max = Arrays.stream(data).max().getAsInt();

        // Step 2: Print the histogram vertically
        for (int i = max; i > 0; i--) { // Loop from max value down to 1
        	
            for (int j = 0; j < data.length; j++) { // Loop over each element in the data array
                if (data[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // New line after each row
        }

        // Step 3: Print the base of the histogram
        for (int j = 0; j < data.length; j++) {
            System.out.print("--");
        }
        System.out.println();

        // Step 4: Print the indices below the base
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j] + " ");
        }
        System.out.println();
    }
   
}

