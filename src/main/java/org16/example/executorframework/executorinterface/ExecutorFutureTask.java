package org16.example.executorframework.executorinterface;

import java.util.concurrent.*;

public class ExecutorFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //create threadpool
        Executor obj1= Executors.newSingleThreadExecutor();
        ExecutorService obj2=(ExecutorService) obj1;

        //crete a Callable task
        Callable <String> task=new Callable<String>(){
            @Override
            public String call() throws Exception{
                System.out.println("Running " + Thread.currentThread().getUncaughtExceptionHandler());
                return "Task completed";
            }
        };
        //wrap callable in futuretask
        FutureTask<String> obj3=new FutureTask<String>(task);
        //submit FutureTask to executor service
        obj2.submit(obj3);
        String result=obj3.get();
        System.out.println("Result from FutureTask: " + result);
        obj2.shutdown();

    }
}
