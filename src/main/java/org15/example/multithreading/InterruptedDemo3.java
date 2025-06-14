package org15.example.multithreading;

public class InterruptedDemo3  extends Thread{
    public void run(){
        try{
           for(int i=0;i<5;i++){
               System.out.println("Child Thread executing");
               Thread.sleep(1000);
               i++;
           }
        }catch(InterruptedException e){
            System.out.println("Child Thread interrupted");
        }
    }

    public static void main(String[] args) {
        InterruptedDemo3 obj=new InterruptedDemo3();
        obj.start();
        obj.interrupt();
        System.out.println("Main thread exiting");
    }

}
