package org15.example.multithreading.practicequestions;
class Lower extends Thread{
    private String s;
    public Lower(String s){
        this.s=s;
    }
    @Override
    public void run(){
        String str=s.toLowerCase();
        for(char c:str.toCharArray()){
            System.out.println("i am from lowercase:"+c);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Upper extends Thread{
    private String s;
    public Upper(String s){
        this.s=s;
    }
    @Override
    public void run(){
        String str=s.toUpperCase();
        for(char c:str.toCharArray()){
            System.out.println("i am uppercase:"+c);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
public class UppercaseLowercase {
    public static void main(String[] args) {
        String text="IamYourSuperior";
        Lower l=new Lower(text);
        Upper u=new Upper(text);
        l.start();
        u.start();

        try{
            l.join();
            u.join();
        }catch(InterruptedException e1){
            System.out.println(e1);
        }
        System.out.println("Main thread executing finished");
    }
}
