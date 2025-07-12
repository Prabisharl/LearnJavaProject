package org17.example.locks;
//class BankAccount {
//    private int balance = 1000;
//    private final ReentrantLock lock = new ReentrantLock(true); // ✅ Fair lock
//
//    public void withdraw(String user, int amount) {
//        try {
//            System.out.println(user + " is trying to withdraw ₹" + amount);
//
//            // ✅ Interruptible lock acquire
//            lock.lockInterruptibly();
//
//            try {
//                if (balance >= amount) {
//                    System.out.println(user + " is processing withdrawal...");
//                    Thread.sleep(2000); // Simulate delay
//                    balance -= amount;
//                    System.out.println(user + " completed withdrawal. Remaining: ₹" + balance);
//                } else {
//                    System.out.println(user + " - Insufficient balance!");
//                }
//            } finally {
//                lock.unlock(); // ✅ Always unlock
//            }
//
//        } catch (InterruptedException e) {
//            System.out.println(user + " was interrupted while waiting for lock.");
//        }
//    }
//}
//public class ReentrantLockDemoWithlockInterruptibly {
//public static void main(String[] args) {
//    BankAccount account = new BankAccount();
//
//    // Thread 1 – normal withdraw
//    Thread user1 = new Thread(() -> account.withdraw("User-1", 600));
//
//    // Thread 2 – will be interrupted while waiting
//    Thread user2 = new Thread(() -> account.withdraw("User-2", 700));
//
//    user1.start();
//
//    try {
//        Thread.sleep(500); // Let user1 acquire the lock first
//    } catch (InterruptedException e) { }
//
//    user2.start();
//
//    // Interrupt user2 after 1 sec if still waiting
//    try {
//        Thread.sleep(1000);
//        System.out.println("Interrupting User-2...");
//        user2.interrupt();
//    } catch (InterruptedException e) { }
//}
//}
