package org.subh.module_2_Creating_Threads;

public class MyThreads extends Thread{
/*
 Note : If we want to extend from another class we can't becz Java didn't support multiple inheritance

 
 */
    private String taskName;
    public MyThreads(String taskName){
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Task :"+ taskName + " | Thread : "+ Thread.currentThread().getName() + " | Started");

        for(int i=1; i <=3; i++){
            System.out.println(taskName +" step : ->" + i);
        }

        System.out.println("Task : "+ taskName + "| Finished");
    }
}
