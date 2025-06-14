package org15.example.multithreading;

public class InterruptedDemo2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child thread executing");
                //Here current threads goes to sleeping state
                // Another thread gets the chance to execute
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interruptedexception occured");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptedDemo2 obj2=new InterruptedDemo2();
        obj2.start();
//        Thread.sleep(2000);
        obj2.interrupt();

        System.out.println("main thread exiting");
        System.out.println("main thread exiting");
        System.out.println("main thread exiting");
        System.out.println("main thread exiting");
        System.out.println("main thread exiting");
    }
}
