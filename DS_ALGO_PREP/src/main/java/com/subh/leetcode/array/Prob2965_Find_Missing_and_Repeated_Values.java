package com.subh.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class Prob2965_Find_Missing_and_Repeated_Values {

    public static void main(String[] args) {
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};                   //{{1,3},{2,2}};

      int [] res =   findMissReptdVal(grid);

      for(int i : res){
          System.out.print(i + " ");
      }

    }

    public static int[] findMissReptdVal(int[][] grid){
        int size = grid.length;
        int [] result = new int[2];
        int a  = -1;
        int b = -1;


        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
            }
        }

        System.out.println(map);

        for(int n=1; n<=size*size; n++){
            if(!map.containsKey(n)){
                b = n;
            }
            else if(map.getOrDefault(n,0) == 2){
                a = n;
            }
            if(a !=-1 && b !=-1){
                break;
            }
        }

            result[0] = a;
            result[1] = b;


        return result;
    }
}
