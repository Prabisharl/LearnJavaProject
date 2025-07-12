package org16.example.executorframework.executorserviceinterface;
import java.util.concurrent.*;

public class SubmitMethod {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Callable
        Callable<String> callableTask = () -> "Callable Result";
        Future<String> future1 = executor.submit(callableTask);
        System.out.println("Callable: " + future1.get());

        // Submit Runnable
        Runnable runnableTask = () -> System.out.println("Runnable executed");
        Future<?> future2 = executor.submit(runnableTask);  // returns null
        System.out.println("Runnable result: " + future2.get());  // prints null

        executor.shutdown();
    }
}
