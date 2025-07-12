package org17.example.locks;
//tryOptimisticRead()?
//It allows a thread to read without locking.
//
//It's fast and non-blocking.
//
//But the read may be invalid if a write occurred during the read → so we must validate the read using lock.validate(stamp).

import java.util.concurrent.locks.StampedLock;

class BankAccount{
    private double balance=1000;
    private final StampedLock lock=new StampedLock();

    public void deposit(double amount){
        long stamp=lock.writeLock();
        if(balance>=amount){
        try{
            System.out.println("depositing...");
            balance=balance-amount;
            Thread.sleep(5000);
            System.out.println("deposit completed by "+Thread.currentThread().getName());
        }catch(InterruptedException e){
            System.out.println(e);
        }finally{
            lock.unlockWrite(stamp);
        }
    }}

    // Reader: check balance using optimistic read
//    public void checkBalance(){
//        long stamp=lock.tryOptimisticRead();
//        double currentBalance=balance;
//
//        // Validate: was there a write during the read?
//
////        if (!lock.validate(stamp)) {
////            // Fallback to proper read lock
////            System.out.println(Thread.currentThread().getName() + " optimistic failed, taking read lock...");
////            stamp = lock.readLock();
////            try {
////                currentBalance = balance;
////                System.out.println(Thread.currentThread().getName() + " (read lock): " + currentBalance);
////            } finally {
////                lock.unlockRead(stamp);
////            }
//        }

    }




public class StampedLockDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

//        // Writer thread: deposit money
//        Thread writer = new Thread(() -> account.deposit(500), "Writer");
//
//        // Reader thread: check balance
//        Thread reader1 = new Thread(account::checkBalance, "Reader-1");
//        Thread reader2 = new Thread(account::checkBalance, "Reader-2");
//
//        reader1.start();
//        reader2.start();
//        // Wait a bit before writing
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//        }
//
//        writer.start();

    }
}