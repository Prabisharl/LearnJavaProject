package org16.example.executorframework.executorinterface;

import java.util.concurrent.*;

public class ExecutorFuture {
    public static void main(String[] args) {
        //Get an executor
        Executor obj1= Executors.newSingleThreadExecutor();
        //cast Executor to ExecutorService to use submit() and future
        ExecutorService obj2=(ExecutorService) obj1;

        //override call() method from callable Functionalinterface
        Callable<String> task=new Callable<String>(){
            @Override
            //You only need throws Exception in your code if you’re actually throwing a checked exception inside the call() method.
            //it’s not mandatory to throw an exception.
            public String call() throws Exception{
                System.out.println("Running"+ Thread.currentThread().getName());
                return "Task Completed";
            }
        };
        //submit task using submit method of executorservice and get Future
        try{
            //submit to future
            Future<String> obj3=obj2.submit(task);
            //get the future
            String result=obj3.get();
            System.out.println("Result from Future: " + result);

        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while waiting for result.");
        } catch (ExecutionException e) {
            System.out.println("An error occurred inside the task: " + e.getCause().getMessage());

        }finally{
            //shutdown the executor service
            obj2.shutdown();

        }
    }
}
/*String result = future.get();
This line can throw two checked exceptions:

InterruptedException –
if the current thread is interrupted while waiting.

ExecutionException –
if the call() method inside the Callable throws any exception.
Even RuntimeExceptions inside call() will be wrapped and thrown as ExecutionException.

 */