package org17.example.locks;
class CoffeeMachine{

    public void make(String customerName){
        System.out.println("hello .....Please come");
        synchronized(this){
            System.out.println(customerName +" is using cofeemachine");
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(customerName +" finished taking coffee");
        }
    }
}

class CustomerThread extends Thread{
    private CoffeeMachine cofmac;
    private String customerName;

    public CustomerThread(CoffeeMachine c, String n){
        this.cofmac=c;
        this.customerName=n;
    }

    @Override
    public void run(){
        cofmac.make(customerName);
    }
}
public class SynchronizedOrObjectLevelLock {
    public static void main(String[] args) {
        CoffeeMachine c=new CoffeeMachine();
        String n1="Raghavan";
        String n2="Maheer";
        String n3="Raguvan";
        CustomerThread t1=new CustomerThread(c,n1);
        CustomerThread t2=new CustomerThread(c,n2);
        CustomerThread t3=new CustomerThread(c,n3);
        t1.start();
        t2.start();
        t3.start();
    }
}
