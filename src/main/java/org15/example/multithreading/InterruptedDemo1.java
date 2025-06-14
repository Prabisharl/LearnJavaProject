package org15.example.multithreading;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class InterruptedDemo1 implements Runnable {
    @Override
    public void run(){
        try{
            System.out.println("in run()-about to work()");
            work();
            System.out.println("in run()-back to worlk()-this line will not be excuted");
        }catch(InterruptedException e){
            System.out.println("in run()-interrupted in work()");
            return;
        }
        System.out.println("in run()-doing stuff after nap");
        System.out.println("in run()-leaving normally");
    }

    public void work() throws InterruptedException{
        while(true){
           // System.out.println("working....");
            if(Thread.currentThread().isInterrupted()){
                System.out.println("isInterrupted()="+Thread.currentThread().isInterrupted());
//                System.out.println("Interrupted()="+Thread.interrupted());

                TimeUnit.MILLISECONDS.sleep(1);
                System.out.println("this line wont be executed");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{ //interruptedexception because of sleep
        InterruptedDemo1 task=new InterruptedDemo1();
        Thread t=new Thread(task);
        t.start();
        long currentSeconds = Instant.now().getEpochSecond();
        System.out.println("Current time in seconds: " + currentSeconds);

        t.sleep(2000);
        //Timeunit.MILLISECONDS.sleep(2000);
        //timeUnit.SECONDS.sleep(2);
        currentSeconds = Instant.now().getEpochSecond();
        System.out.println("Current time in seconds: " + currentSeconds);

        System.out.println("in main()-interrupting other thread");
        t.interrupt();

        //t.join();
        System.out.println("in main()-exiting thread");

    }
}
