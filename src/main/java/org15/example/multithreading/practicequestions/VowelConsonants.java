package org15.example.multithreading.practicequestions;


class Vowel extends Thread{
    String s;
    Vowel(String s){
       this.s=s;
    }
    @Override
    public void run(){
        for(char c:s.toCharArray()){
            if(VowelConsonants.isVowel(c)){
                System.out.println("vowel:"+c);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println("Exception catched");
                }
            }
        }
    }
}

class Consonant extends Thread{
    String s;
    Consonant(String s){
        this.s=s;
    }
    @Override
    public void run(){
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) && !VowelConsonants.isVowel(c)){
                System.out.println("Consonant:"+c);
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }

}
public class VowelConsonants extends Thread{
    public static boolean isVowel(char c){
        switch(Character.toLowerCase(c)){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
    public static void main(String[] args) {
String input="MultithreadingRocks";
Vowel v=new Vowel(input);
Consonant c=new Consonant(input);
v.start();
c.start();
    }

}
