package org15.example.multithreading;

public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t2.start();
    }
}
