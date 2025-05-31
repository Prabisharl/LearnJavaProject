package org6.example.constructor;

public class BankApplication {
    String customerName;
    int customerId;
    int balance;

    BankApplication(String customerName, int customerId, int balance) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.balance = balance;
    }

    void deposit(int amount){
        balance=balance+amount;
        System.out.println("Deposited amount: "+amount);
        System.out.println("Total balance amount in account: "+balance);
    }
    void withdraw(int amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println(("withdraw amount: "+amount));
            System.out.println("Total balance amount in account: "+balance);
        }
        else{
            System.out.println("Sorry, Insuffient balance in your account");
        }
    }
    void display(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Id: "+customerId);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        BankApplication member1=new BankApplication("John Doe", 111, 500);
        BankApplication member2=new BankApplication("Jan Doe", 222, 500);
        BankApplication member3=new BankApplication("Hel Doe", 333, 1500);
        BankApplication member4=new BankApplication("Johan Doe", 444, 1000);
        BankApplication member5=new BankApplication("Jahaeil Doe", 555, 5000);

        member1.display();
        member1.withdraw(1000);
        member1.withdraw(200);
        member1.deposit(200);
    }
}
