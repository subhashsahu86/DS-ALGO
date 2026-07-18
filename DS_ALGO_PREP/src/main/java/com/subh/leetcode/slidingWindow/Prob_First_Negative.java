package com.subh.leetcode.slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prob_First_Negative {

    public static void main(String[] args) {

        int [] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println("{12, -1, -7, 8, -15, 30, 16, 28}");

        int k = 3;

        List<Integer> result = findFirstNegative(arr, k);

        System.out.println(result);

        System.out.println();

        List<Integer> result1 = findFirstNegativeBruteForce(arr, k);

        System.out.println(result1);

    }

    public static List<Integer> findFirstNegative(int [] arr , int k){

        //window banayenge k size , window banne se phle ek queue lenge or jo bhi first negative aayega
        // usko queqe mein add krenge jb window k size ki ban jygi to first negatvie element result List
        // mein add krenge or i++ krenge or remove the first element in the queue also
        // if queue is empty will add 0

        int i=0;
        int j=0;
        int n = arr.length-1;

        Queue<Integer> que = new LinkedList<>();

        List<Integer> res = new ArrayList<>();

        while (j<=n){

            if(j-i+1 < k) {
                if (arr[j] < 0) {
                    que.add(arr[j]);
                }
                    j++;

            }

            else if (j-i+1 == k){
                if(arr[j]<0){
                    que.add(arr[j]);
                }
                    if(que.isEmpty()){
                        res.add(0);
                        i++;
                        j++;
                    }
                    else{

                        res.add(que.peek());

                        if(arr[i] < 0){
                          que.poll();
                        }
                        i++;
                        j++;
                    }
                }


        }

        return res;

    }

    public static List<Integer> findFirstNegativeBruteForce(int[] arr, int k){

        List<Integer> res = new ArrayList<>();

        Queue<Integer> que = new LinkedList<>();

        int n = arr.length-1;

        for(int i=0; i<n; i++){
            for(int j=i; j<=i+3; j++ ){
                if(j < i+3){
                    if(arr[j]<0){
                        que.add(arr[j]);
                    }

                }

                if(j+1 == i+3){
                    if(arr[j]<0){
                        que.add(arr[j]);
                    }

                    if(que.isEmpty()){
                        res.add(0);
                    }else{
                        res.add(que.peek());
                    }

                }

            }

        }
        return res;
    }
}
