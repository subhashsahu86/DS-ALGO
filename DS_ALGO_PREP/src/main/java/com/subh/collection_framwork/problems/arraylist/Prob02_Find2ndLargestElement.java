package com.subh.collection_framwork.problems.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob02_Find2ndLargestElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(7);
        list.add(5);
        list.add(2);
       list.add(8);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(9);

     Integer result = find2ndLargestElement(list);
        System.out.println(result);


        // Problem: Find the second largest element in an ArrayList without sorting.
        // Input: [5, 2, 8, 1, 9, 3, 9]
        // Output: 8


    }


    public static Integer find2ndLargestElement(List<Integer> list) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num > largest) {
                secondLargest = largest;
                largest = num;


            } else if (num>secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

}
