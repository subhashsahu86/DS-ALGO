package com.subh.leetcode.stack;

import java.util.Stack;

public class Prob901_OnlineStockSpan {

    static Stack<Pairs> st = new Stack<>();

 static class Pairs{
        int price;
        int count;

        Pairs(int price , int count){
            this.price = price;
            this.count = count;
        }
    }
    
    public static void main(String[] args) {



        System.out.print( next(100) + " ");
        System.out.print( next(80)+" ");
        System.out.print( next(60)+ " ");
        System.out.print( next(70)+" ");
        System.out.print( next(60)+" ");
        System.out.print( next(75)+" ");
        System.out.print( next(85)+" ");


    }



    public static int next(int price){

        int count = 1;

        while(!st.isEmpty() && st.peek().price <= price  ){
          count += st.peek().count;
            st.pop();


        }

        st.push(new Pairs(price, count));

        return st.peek().count;
    }
}


