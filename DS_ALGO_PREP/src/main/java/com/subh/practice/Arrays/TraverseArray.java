package com.subh.practice.Arrays;

import java.util.Arrays;
import java.util.function.Consumer;

public class TraverseArray {

    /*
    By using for ways we can traverse the Array elements
    1. By using index arr[1] , arr[2] .....
    2. By using for loop
    3. By using for each loop
    4. By using Arrays.toString() method
     */

    public static void main(String[] args) {

        //creating the array
        int [] ia =  {10,20,40, 30, 20};


        // 1. approch
        System.out.println("First Approach : By using index");
        System.out.println(ia[1]);
        System.out.println(ia[2]);

        System.out.println("=================================================");

        //2. Approach
        System.out.println("Second Approach : By using for loop");
        for(int i=0; i<ia.length; i++){
            System.out.println(ia[i]);
        }

        System.out.println("=================================================");

        //3. Approach
        System.out.println("Third Approach : By using for each loop");

        for(int i : ia){
            System.out.println(i);
        }


        //4. Approach
        System.out.println("Fourth Approach : By using Arrays.toString");

        //in this qpproach we get the full array object not element
        System.out.println(Arrays.toString(ia));


        //by Consumer interface
        Consumer<int[]> consumer = c -> {

          for(int i : c){
              System.out.println(i);
          }
        };
        consumer.accept(new int[] {5,7,7,4,3,3,22,29});




    }

    public static void updateElement(int oldValue , int newValue){
        int [] arr4 = {10,40, 50, 20};
        for (int i =0; i<arr4.length; i++){
            if(arr4[i] ==oldValue ){
                arr4[i] = newValue;
                break;
            }
        }
        System.out.println("updation succesfully : "+ " old value : "+ oldValue + " and New Value : " + newValue);

         for(int i : arr4){
             System.out.println(" New Elements : "+ i);
         }

    }

}
