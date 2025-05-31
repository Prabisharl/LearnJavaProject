package org15.example.multithreading;
class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){

            try {
                System.out.println("Thread A: "+i);
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread B: "+i);
            try{

                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread C:"+i);
            try{

                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class D extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread D: "+i);
            try{

                Thread.sleep(100);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}
public class UsingThreadClass{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d=new D();
a.setPriority(1);
System.out.println(a.getPriority());
a.start();

b.setPriority(2);
b.start();

c.setPriority(3);
c.start();

d.setPriority(10);
d.start();
    }
}