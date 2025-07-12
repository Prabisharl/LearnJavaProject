package org17.example.locks;

import java.util.concurrent.locks.ReentrantLock;

class Restaurant1{
    private int tablesAvailable=5;
    private final ReentrantLock lock=new ReentrantLock();

    public void bookSeat(String customerName){
        lock.lock();
        try{
          if(tablesAvailable>0){
              tablesAvailable--;
              System.out.println(customerName+" booked seat-"+Thread.currentThread().getName());
          }else{
              System.out.println("Sorry "+customerName+ " has no seat");
          }
        }
        finally{
            lock.unlock();
        }
    }
}

class CustomerThread1 extends Thread{
    private Restaurant1 res;
    private String customerName;
    public CustomerThread1(Restaurant1 res, String customerName){
        this.res=res;
        this.customerName=customerName;
    }
    @Override
    public void run(){
        res.bookSeat(customerName);
    }

}
public class ReentrantLockDemo {
    public static void main(String[] args) {
        Restaurant1 r=new Restaurant1();
        String customer1="Arun";
        String customer2="Reshma";
        String customer3="Hema";

        CustomerThread1 t1=new CustomerThread1(r,customer1);
        CustomerThread1 t2=new CustomerThread1(r,customer2);
        CustomerThread1 t3=new CustomerThread1(r,customer3);
        t1.start();
        t2.start();
        t3.start();
    }
}
