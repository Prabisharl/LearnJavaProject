package org16.example.executorframework.executorserviceinterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunnable {
    public static void main(String[] args) {
        ExecutorService obj1= Executors.newSingleThreadExecutor();
        //create a Runnable task
        Runnable obj2=new Runnable(){
        @Override
        public void run(){
            System.out.println("Runnable"+Thread.currentThread().getName());
        }};
       obj1.submit(obj2);
        obj1.shutdown();
    }

}
