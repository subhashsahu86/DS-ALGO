package com.subh.practice;

public class CheckPailandrome {

    public static void main(String[] args) {

        String str = "a man a plan a canal : panama";

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() -1;

        boolean isPaliandrome =  true;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){

                isPaliandrome = false;
                break;
            }

            left ++;
            right --;
        }

        if(isPaliandrome) {
            System.out.println("Given String is Pailandrome");
        }
        else{
                System.out.println("Given String is not a Pailandrome");
            }


        }


}
