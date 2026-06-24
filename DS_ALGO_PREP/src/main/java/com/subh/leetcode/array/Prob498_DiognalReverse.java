package com.subh.leetcode.array;

import java.util.*;

public class Prob498_DiognalReverse {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before solution : ");

        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
        }

      int [] result =   reverseDiognal(mat);

        for(int i : result){
            System.out.print(i + " ");
        }

    }

    public static int[] reverseDiognal(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        int [] res = new int[m*n];

        //adding the elements into map
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map.computeIfAbsent((i+j), k -> new ArrayList<>()).add(mat[i][j]);
            }
        }
        System.out.println(map);
        //revers the elements of the odd key

        for(Integer key : map.keySet()){
            if(key %2 == 0){
                Collections.reverse(map.get(key));
            }
        }

        System.out.println(map);

        int index = 0;

        //traverse the elements from map and store in the array and return it.
        for(List<Integer> lst : map.values()){
            for(int i : lst){
              res[index]  = i;
              index++;
            }
        }

        return res;
    }
}
