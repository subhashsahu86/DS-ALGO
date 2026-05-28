package org.subh.module_3_Race_syncronized;

public class User {

    public static void main(String[] args) throws InterruptedException {
        //open the account of the user
        BankAccount acc2 = new BankAccount();

        Thread depositor = new Thread(() ->{
         for(int i=1; i<=100; i++){
             acc2.deposit(1000);
         }
        },"depositor Thread");



        Thread withdrawer = new Thread(()->{
            for(int i=1; i<=100; i++){
                acc2.withdrawAmt(1000);
            }
        },"withdrawer Thread");

        depositor.start();

        withdrawer.start();
        
        depositor.join();
        withdrawer.join();

        System.out.println(acc2.getAmount());


    }
}
