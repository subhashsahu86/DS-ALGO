package org.subh.module_2_Creating_Threads_4Ways;

import java.util.concurrent.Callable;

public class Way03_Callable_Future implements Callable<String> {
     private String orderNo;

     public Way03_Callable_Future(String orderNo){
         this.orderNo = orderNo;
     }

    @Override
    public String call() throws Exception {

        processingInvoice();

        return "Invoice Is Generated Succesfully against the Order No : "+ orderNo;
    }

    public  void processingInvoice() throws InterruptedException {

        System.out.println(Thread.currentThread().getName()+ " : "+ "Processing the Invoice.");

        Thread.sleep(2000);
    }


}
