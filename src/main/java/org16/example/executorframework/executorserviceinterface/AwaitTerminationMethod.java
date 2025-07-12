package org16.example.executorframework.executorserviceinterface;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationMethod {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService obj1= Executors.newFixedThreadPool(2);
        //Multiple task submitted
        // lambda expression. It works only when Java expects a functional interface.
        obj1.submit(() -> {
            try{
             Thread.sleep(1000);
                System.out.println("Task 1 completed");
        }catch(InterruptedException e){
                System.out.println("Exception in thread: " + Thread.currentThread().getName());
            }

        });
        obj1.submit(()->{
            System.out.println("Task 2 completed");
        });

        obj1.submit(()->{
            System.out.println("Task 3 completed");
        });
        obj1.shutdown();  // stop accepting new tasks
        System.out.println("IS shutdown or not:"+obj1.isShutdown());
        if(obj1.awaitTermination(1, TimeUnit.SECONDS)){
            System.out.println("All tasks completed within the timeout period.");
        }else{
            System.out.println("Not all tasks completed within the timeout period.");
            System.out.println("Sorry,Timeout");
            obj1.shutdownNow();
        }

        System.out.println("Is terminated"+obj1.isTerminated());


    }
}
