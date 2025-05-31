package org9.example.polymorphism.methodOverriding;

class Bank{
    double getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{

    @Override
    double getInterestRate(){
        return 7.0;
    }
}

class ICICI extends Bank{
    @Override
    double getInterestRate(){
        return 9.0;
    }
}

class HDFC extends Bank{
    @Override
    double getInterestRate(){
        return 7.5;
    }
}
public class DynamiccDispatch2BankInterest {
    public static void main(String[] args) {
        Bank bank;

        bank=new SBI();
        System.out.println(bank.getInterestRate());

        bank=new ICICI();
        System.out.println(bank.getInterestRate());

        bank=new HDFC();
        System.out.println(bank.getInterestRate());
    }
}
