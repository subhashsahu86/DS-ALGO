package org.subh.module_2_Creating_Threads_4Ways;

public class MyThreads extends Thread{
/*
 Note : If we want to extend from another class we can't becz Java didn't support multiple inheritance

// What if MyThread needs to extend another class?
class MyThread extends Thread {  // ❌ already using inheritance slot
    // Java doesn't support multiple inheritance
    // You CANNOT also extend any other class now
}

// Real world example — this is IMPOSSIBLE:
class MyThread extends Thread extends BaseWorker { // ❌ COMPILE ERROR
}

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
