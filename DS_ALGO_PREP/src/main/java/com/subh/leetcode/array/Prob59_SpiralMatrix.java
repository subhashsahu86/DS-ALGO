package com.subh.leetcode.array;

public class Prob59_SpiralMatrix {

    public static void main(String[] args) {

       int[][] res =  createSpiralMatrix(3);

       for(int i=0; i< res.length; i++){
           for(int j=0; j<res[0].length; j++){
               System.out.print(res[i][j]+" ");
           }
           System.out.println();
       }

    }

    public static int[][] createSpiralMatrix(int n){
        int[][] mat = new int[3][3];
        int right = mat.length-1;
        int bottom = mat[0].length-1;
        int ele = 1;

        int top=0;
        int left = 0;
        int dir = 0;


        while(top <= bottom && left <= right ){

            // from left to right
            if(dir == 0 ){
               for(int i=left; i<=right; i++){
                   mat[left][i] = ele;
                   ele++;
               }
               dir++;
               top++;
            }
            //from top to bottom
            if(dir == 1){
                for(int i=top; i<=bottom; i++){
                    mat[i][bottom] = ele;
                    ele++;
                }
                dir++;
                right--;
            }
            //from right to left
            if(dir==2){
                for(int i=right; i>=left; i--){
                    mat[bottom][i] = ele;
                    ele++;
                }
                dir++;
                bottom--;
            }
            //from bottom to top
            if(dir==3){
                for(int i=bottom; i>=top; i--){
                    mat[i][left] = ele;
                    ele++;
                }
                dir++;
                left++;
            }

            if(dir==4){
                dir = 0;
            }

        }

        return mat;
    }
}
