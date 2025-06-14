package org15.example.multithreading;

public class DefaultRunnable implements Runnable{
    private String externalString;
    public DefaultRunnable(String externalString){
        this.externalString=externalString;
    }
    public void run(){
        System.out.println("I am new thread and my name is "+Thread.currentThread().getName());
        System.out.println("I am new thread and my name is "+Thread.currentThread().getName());
    //use fields of class if needed.
    }


    public static void main(String[] args) {
        Runnable r1=new DefaultRunnable("Hello World");
        Thread t1=new Thread(r1);
        t1.start();
    }
}
