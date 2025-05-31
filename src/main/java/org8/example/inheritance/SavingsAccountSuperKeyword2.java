package org8.example.inheritance;

class Account {
    Account() {
        System.out.println("Account: Parent, Default Constructor");
    }

    Account(String accountNumber) {
        System.out.println("Account: Account Number from Parent, 1 parametrized constructor → " + accountNumber);
    }

    Account(String accountNumber, double balance) {
        System.out.println("Account: Account Number from Parent, 2 parametrized constructor → " + accountNumber);
        System.out.println("Account: Balance from Parent, 2 parametrized constructor  → ₹" + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount() {
        super("SA123"); // Calls Account(String)
        System.out.println("SavingsAccount: Child, Default Constructor");
    }

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // Calls Account(String, double)
        System.out.println("SavingsAccount: Child, 2 Parametrized Constructor");
    }

}
public class SavingsAccountSuperKeyword2 {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount();
        System.out.println("---");
        SavingsAccount a2 = new SavingsAccount("SA456", 5000.00);
    }
}

