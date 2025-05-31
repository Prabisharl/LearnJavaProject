package org7.example.encapsulation;

public class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;
    }
    public void setBalanceAfterDeposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }
    }
    public void setBalanceAfterWithdraw(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
        }
    }

    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        a.setBalanceAfterWithdraw(10);
        a.setBalanceAfterDeposit(10);
        System.out.println(a.getBalance());
    }
}
