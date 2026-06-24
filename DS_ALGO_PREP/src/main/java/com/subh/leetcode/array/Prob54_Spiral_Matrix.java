package com.subh.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Prob54_Spiral_Matrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println("bottom : "+ matrix.length);
        System.out.println("right : "+ matrix[0].length);
        System.out.println(spiralOrder(matrix));

        System.out.println();

    }

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int dir = 0;



        /*
        dir = 0(towards East) -> from top to right
        dir = 1(towards South) -> from right to down;
        dir = 2(towards West) -> from down to Left
        dir = 3(towards North) -> from down to top
         */

        while (left <= right && top <= bottom){

            if(dir==0 && left<= right){
                for(int i=left; i<=right; i++){
                    res.add(matrix[top][i]);
                }
                top++;
                dir ++;
            }

            if(dir == 1 && top <= bottom){
                for(int i= top; i<=bottom; i++ ){
                    res.add(matrix[i][right]);
                }
                right--;
                dir++;

            }
            if(dir == 2 && right>= left){
                for(int i = right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
                dir++;
            }
            if(dir==3 && bottom >= top){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
                dir++;
            }
            if(dir == 4){
                dir = 0;
            }

        }



        return res;
    }
}
