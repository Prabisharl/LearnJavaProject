package org15.example.multithreading;

public class StaticmethodreferenceThread {
    public static void execute(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1=new Thread(StaticmethodreferenceThread::execute);
        t1.run();
        t1.start();
    }
}
