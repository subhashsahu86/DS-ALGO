package com.subh.collection_framwork.problems.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob01_RemoveEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Creating a List of Integer");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        List<Integer> nums1 = removeEvenNumbers(nums);

        for(int i = 0 ; i < nums1.size() ; i++){
            System.out.print(nums1.get(i) + " ");

        }

    }

     public static List<Integer> removeEvenNumbers(List<Integer> list){
//we can remove element through iterator and removeIf() method from java 8
         // removeIf() method intenally using Iterator and it takes the predicate
         //Removes all of the elements of this collection that satisfy the given predicate.

        list.removeIf(ele -> ele % 2 == 0);

       /*  Iterator<Integer> it = list.iterator();

       while(it.hasNext()){
           Integer element = it.next();
           System.out.println("element come from next method : " + element);
           if(element % 2 ==0){
               it.remove();
           }
       }*/
        return list;
     }
}
