package org15.example.multithreading;

public class ExtendingThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExtendingThread t = new ExtendingThread();
    }
}
