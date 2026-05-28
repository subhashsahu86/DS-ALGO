package com.subh.collection_framwork.problems.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prob03_RotateArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //method 1 using collections.rotate() method
        //List<Integer> result = rotateArray(list, 2);

        // method 2 : rotate custome method
        List<Integer> result = rotateListManually(list, 3);
        System.out.println(result.toString());



        
    }
    
    public static List<Integer> rotateArray(List<Integer> list, int k){

        Collections.rotate(list,k);
        
        return list;
    }

    public static List<Integer> rotateListManually(List<Integer> list, int k){



            int n = list.size();

            if(list==null || list.isEmpty()){
                throw new IllegalArgumentException("List can not be empty or null");
            }


            k = k % n; // handle if k > n

            //step : 1 revers whole list
            reverse(list, 0, n - 1);

            // step : 2 reverse left(k) elements
            reverse(list, 0, k - 1);

            // step 3 : reverse right(k) side element

            reverse(list, k, n - 1);

        return list;
    }

    // two pointer approach
    public static void reverse(List<Integer> list, int start, int end){
        while (start<end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

    }
    
}
