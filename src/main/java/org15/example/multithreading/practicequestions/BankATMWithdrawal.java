package org15.example.multithreading.practicequestions;

//Shared Object: One BankAccount instance accessed by multiple threads.
//Synchronized Method: Prevents multiple threads from withdrawing at the same time.


class BankAccount{
private int balance=5000;
private int amount;

synchronized void withdrawal(int amount){
    if(balance>=amount){
        System.out.println("Withdrawal processing...");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Withdrawal successful");
        balance=balance-amount;
    }else{
        System.out.println("Insufficient balance");
        System.out.println("Your current balance is "+balance+" only");
    }
    System.out.println("-------------------");
}


}
public class BankATMWithdrawal {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        Thread t1=new Thread(()->b.withdrawal(600));
        t1.start();
    }
}
