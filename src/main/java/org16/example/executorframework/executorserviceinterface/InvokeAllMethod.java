package org16.example.executorframework.executorserviceinterface;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllMethod {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService obj1= Executors.newFixedThreadPool(3);
        //create list of callable task
        List<Callable<String>> task= Arrays.asList(
                new Callable<String>(){
                    @Override
                    public String call() throws Exception{
                        return "Task1";
                    }
                },
                new Callable<String>(){
                    @Override
                    public String call() throws Exception{
                        return "Task2";
                    }
                },
                new Callable<String>(){
                    @Override
                    public String call() throws Exception{
                        return "Task3";
                    }
                }
        );
        //List<Callable<String>> taskList = Arrays.asList(
        //    () -> "Task 1",
        //    () -> "Task 2",
        //    () -> "Task 3"
        //);

        List<Future<String>> obj3=obj1.invokeAll(task);
        for(Future<String> obj4:obj3){
            System.out.println(obj4.get());
        }
        obj1.shutdown();
    }
}
