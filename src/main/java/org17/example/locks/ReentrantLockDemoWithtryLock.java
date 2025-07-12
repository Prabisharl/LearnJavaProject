package org17.example.locks;
//tryLock(1, TimeUnit.SECONDS) → tries to get lock for 1 second
//
//If available → print
//
//If not → skip and print a message
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Printer2{
    private final ReentrantLock lock=new ReentrantLock();
    public void print(String user){
        try{
            if (lock.tryLock(5, TimeUnit.SECONDS)) {

                try{
                    System.out.println("printing");
                    Thread.sleep(2000);
                    System.out.println("Finoshed Printing");
                }finally{
                    lock.unlock();
                }
            }else{
                System.out.println("Sorry try again later");
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ReentrantLockDemoWithtryLock {
    public static void main(String[] args) {
        Printer2 p=new Printer2();
        Thread t1=new Thread(()->p.print("liya"));
        t1.start();
        Thread t2=new Thread(()->p.print("Mahi"));
        t2.start();
    }
}
