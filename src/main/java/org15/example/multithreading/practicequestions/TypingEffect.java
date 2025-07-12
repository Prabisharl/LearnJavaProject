package org15.example.multithreading.practicequestions;

public class TypingEffect {
    public static void main(String[] args) {
        String str="Malayalam";
        Thread s=new Thread(()->{
          for(char c:str.toCharArray()){
              System.out.println(c);
              try{
                  Thread.sleep(3000);
              }catch(InterruptedException e){
                  System.out.println(e);
              }

          }
        }

        );
        s.start();
    }
}
