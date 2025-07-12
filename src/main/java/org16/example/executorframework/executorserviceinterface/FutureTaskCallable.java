package org16.example.executorframework.executorserviceinterface;

import java.util.concurrent.*;

public class FutureTaskCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService obj1= Executors.newFixedThreadPool(1);

        Callable<String> obj2=()->{
            System.out.println("Running " + Thread.currentThread().getName());
            return "Task completed";
        };

        FutureTask<String> obj3=new FutureTask<>(obj2);
        obj1.submit(obj3);

        System.out.println(obj3.get());
        obj1.shutdown();


//
//        try {
//            //The submit(Callable) method of ExecutorService returns a Future object internally
//            // You are not declaring a Future variable, but you are still calling .get() on the returned Future object
//            // ExecutorService.submit(Callable) always returns a Future<T>..
//            String result = obj1.submit(obj2).get();
//            System.out.println("Result from Callable: " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            obj1.shutdown();
//        }
    }
}
