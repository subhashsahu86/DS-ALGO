package org.subh.module_2_Creating_Threads_4Ways;

public class Way02_Runnable implements Runnable{


    // with this approach we can extends to other class.
    //Problem in this approach : we can't return any value and throw any Exception
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " : Run Method");
    }

}
