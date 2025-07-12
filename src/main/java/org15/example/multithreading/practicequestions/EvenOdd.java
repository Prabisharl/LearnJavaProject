package org15.example.multithreading.practicequestions;
class Even extends Thread{
    private int limit;
    public Even(int limit){
        this.limit=limit;
    }
    @Override
    public void run(){
        for(int i=0;i<=limit;i++){
            if(i%2==0){
                System.out.println("Even:"+i);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
class Odd extends Thread{
    private int limit;
    public Odd(int limit){
        this.limit=limit;
    }
    @Override
    public void run(){
        for(int i=0;i<=limit;i++){
            if(i%2!=0){
                System.out.println("Odd:"+i);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        Even e=new Even(100);
        Odd o=new Odd(100);

        // Display the priority of above threads
        // using getPriority() method
        System.out.println("t1 thread priority: " + e.getPriority());
        System.out.println("t2 thread priority: " + o.getPriority());

        // Setting priorities of above threads by
        // passing integer arguments
        e.setPriority(1);
        o.setPriority(10);


        e.start();
        o.start();
        // Check if threads are alive after starting
        System.out.println("EvenThread alive? " + e.isAlive());
        System.out.println("OddThread alive? " + o.isAlive());

        // Wait for threads to finish
        try{
            e.join();
            o.join();
        }catch(InterruptedException e1){
            System.out.println(e1);
        }

        // Final check
        System.out.println("EvenThread alive after completion? " + e.isAlive());
        System.out.println("OddThread alive after completion? " + o.isAlive());

        System.out.println("Main Thread Exiting...");

    }
}
