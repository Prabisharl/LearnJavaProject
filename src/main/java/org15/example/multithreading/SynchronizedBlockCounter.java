package org15.example.multithreading;

class CounterBlock{
    private int c=0;

    public void increment(){
        synchronized(this){
            c++;
            System.out.println(Thread.currentThread().getName());

        }
        System.out.println(c);
    }

    public int get(){
        return c;
    }
}
public class SynchronizedBlockCounter {
    public static void main(String[] args) {
        CounterBlock c=new CounterBlock();//shared resource
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                c.increment();
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
            e.printStackTrace();
        }
        System.out.println(c.get());
    }
}

