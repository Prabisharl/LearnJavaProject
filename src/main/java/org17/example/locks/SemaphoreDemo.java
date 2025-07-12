package org17.example.locks;

import java.util.concurrent.Semaphore;

//Limit the number of threads accessing a resource.
//
//Coordinate or control access to a shared resource (e.g., only 3 people in a room at a time).
class SharedPrinter{
    private final Semaphore s=new Semaphore(2);
    public void print(String user){
        try{

            s.acquire();
            System.out.println("Printing is processing by "+user);
            Thread.sleep(200);
            System.out.println("Finished");
        }catch(InterruptedException e){
            System.out.println(e);
        }finally{
            s.release();
        }
    }
}
public class SemaphoreDemo {
    public static void main(String[] args) {
        SharedPrinter p=new SharedPrinter();

        Thread t1=new Thread(()->{
            p.print("Hari");
        });
        t1.start();

        Thread t2=new Thread(()->{
            p.print("Dari");
        });
        t2.start();
        Thread t3 = new Thread(() -> {
            p.print("Mari");
        });
        t3.start();
    }
}
