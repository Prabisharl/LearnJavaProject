package org15.example.multithreading.practicequestions;

class User1 implements Runnable{
   private String name;
   private String[] messages;

   public User1(String name, String[] messages){
       this.name=name;
       this.messages=messages;
   }

   @Override
    public void run(){
       for(String msg:messages){
           System.out.println( name +": "+ msg);
           try{
               Thread.sleep(3000);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
       }
   }

}
class User2 implements Runnable{
 private String name;
 private String[] messages;
 public User2(String name,String[] messages){
     this.name=name;
     this.messages=messages;
 }
 @Override
    public void run(){
     for(String msg:messages){
         System.out.println(name +": "+msg);

         try{
             Thread.sleep(4000);

         }catch(InterruptedException e){
             System.out.println(e);
         }

     }
 }
}
public class ChatSimulator {
    public static void main(String[] args) {


        String user1 = "Ragin";
        String user2 = "Rithvik";
        String[] chats1 = {"Hi", "How are you", "Do you know me", "When will we meet up"};
        String[] chats2 = {"Hello", "I am fine", "Yes I know", "Friday"};

        Thread t1 = new Thread(new User1(user1, chats1));
        Thread t2 = new Thread(new User2(user2, chats2));

        t1.start();
        t2.start();

    }
}