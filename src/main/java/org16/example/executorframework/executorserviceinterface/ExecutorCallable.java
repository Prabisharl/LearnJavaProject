package org16.example.executorframework.executorserviceinterface;

import java.util.concurrent.*;

public class ExecutorCallable {
    public static void main(String[] args) {
        ExecutorService obj1= Executors.newSingleThreadExecutor();
        Callable<String> obj2=new Callable<>(){
            @Override
            public String call() throws Exception{
                Thread.sleep(2000);
                return "Result from Callable: " + Thread.currentThread().getName();
            }
        };
        Future<String> obj3=obj1.submit(obj2);
        try{
            System.out.println(obj3.get());
        }catch(InterruptedException e1){
            System.out.println("Thread was interrupted while waiting for result.");
        }catch (ExecutionException e2){
            e2.printStackTrace();
        }

    }
}
