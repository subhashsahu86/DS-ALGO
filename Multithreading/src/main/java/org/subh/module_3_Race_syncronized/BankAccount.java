package org.subh.module_3_Race_syncronized;

public class BankAccount  {
    private int currentBalance;



    public  String deposit(int amount){

        if(amount<0){
            return "Invalid Amount !";
        }

            currentBalance += amount;

        return "Rs. "+amount +" is successfully debited from your account. current balance is " + currentBalance;
    }

    public  String withdrawAmt(int amount){
        if(amount<0 && currentBalance<amount){
            return "Invalid amount and insufficient Amount";
        }

            currentBalance -= amount;


        return "Withdrawal of Amount" + amount +" is successfully done. Your current Balance is "+currentBalance;
    }

    public int getAmount(){
        return currentBalance;
    }



}
