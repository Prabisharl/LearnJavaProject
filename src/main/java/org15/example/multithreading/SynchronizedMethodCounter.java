package org15.example.multithreading;

//it is a mechanism that ensures that only one thread can access a resource at any given time. This process helps prevent issues such as data inconsistency and race conditions when multiple threads interact with shared resources.
class Counter{
    private int c=0; //Shared variable

    public synchronized void increment(){
        c++;
        System.out.println(Thread.currentThread().getName());
        System.out.println(c);
    }
    public synchronized int get(){
        return c;
    }
}


public class SynchronizedMethodCounter {
    public static void main(String[] args) {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    c.increment();
                }
            }
        });

        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<10;i++){
                    c.increment();
                }
            }
        });

        Thread t3=new Thread(()->{
            for(int i=0;i<10;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println(c.get());
    }
}
