package org16.example.executorframework.executorinterface;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        //Get an executor using Executors but uses internal threadpool
        Executor executor= Executors.newSingleThreadExecutor();
        //override run method of runnable task
        Runnable task=()->{
            System.out.println("Task is running:"+Thread.currentThread().getName());
        };

        /*using anonymous class
        Runnable task=new Runnable(){
        @Override
        public void run(){
        System.out.println("Task is running:"+Thread.currentThread().getName());
           }
        };        */

        //execute task using executor method of executor interface only
        executor.execute(task);
    }
}
