package com.subh.leetcode.array;

import java.util.*;

public class Prob1329_SortMatrixDiogannly {

    public static void main(String[] args) {

        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        System.out.println("Before solution : ");

        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
        }


        sortDioganally(mat);

        System.out.println();

        System.out.println("After solution : ");

        for(int i=0; i< mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
        }



    }

    public static int[][]  sortDioganally(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        //store the elements in the map dioganally
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map.computeIfAbsent((i-j), k -> new ArrayList<>()).add(mat[i][j]);
            }
        }

        //sort the list elements
        for(List<Integer> lst : map.values()){
            Collections.sort(lst);
        }

        //put them sorted elements into matrix again and we are putting from back or reverse order so
        //after putting we will delete the element from sorted list
        for(int i = m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                List<Integer> list = map.get(i-j);

                int lastIndex = list.size()-1;
                mat[i][j] = list.remove(lastIndex);
            }
        }

      return mat;
    }
}

/*
Method 2
==========
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
         int m = mat[0].length;
         int k = Math.min(n,m);

        int[] dig = new int[k];
        int currRow = 0;
        int currCol = 0;
        int currDig = 0;

        while(currCol < m) {
            sortCurrentDigonal(mat, currDig, k, currRow, n, currCol, m, dig);
            currDig = 0;
            currRow = 0;
            currCol++;
        }

        currRow = 1;
        currCol = 0;
        currDig = 0;
        while(currRow < n) {
            sortCurrentDigonal(mat, currDig, k, currRow, n, currCol, m, dig);
            currDig = 0;
            currRow++;
            currCol = 0;
        }
      return mat;
    }

    private static void sortCurrentDigonal(int[][] mat, int currDig, int k, int currRow, int n, int currCol, int m, int[] dig) {
        while (currDig < k && currRow < n && currCol < m) {
            dig[currDig++] = mat[currRow++][currCol++];
        }

        Arrays.sort(dig, 0, currDig);
        while (currDig >= 1 && currRow >= 1 && currCol >= 1) {
            mat[--currRow][--currCol] = dig[--currDig];
        }
    }
}
 */
