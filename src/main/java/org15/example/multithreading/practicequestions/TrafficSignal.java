package org15.example.multithreading.practicequestions;
class SignalColor implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
            try{
                System.out.println("Cycle "+i);

                System.out.println("Red");
                Thread.sleep(3000);
                System.out.println("Yellow");
                Thread.sleep(2000);
                System.out.println("Green");
                Thread.sleep(6000);
                System.out.println();// Blank line between cycles
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class TrafficSignal {
    public static void main(String[] args) {
        SignalColor s=new SignalColor();
        Thread t1=new Thread(s);
        t1.start();
    }
}
