package org15.example.multithreading;

public class LambdaThread {
    public static void main(String[] args) {
        Thread t1=new Thread(  ()
                ->System.out.println(Thread.currentThread().getName())
        );
        t1.start();
    }
}
