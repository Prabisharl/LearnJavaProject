package org10.example.abstraction.interfaceExample.publicandabstractmethod;

interface Flyable{
    void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird is flying with wings");
    }
}
class Aeroplane implements Flyable{
    public void fly(){
        System.out.println("Aeroplane is flying with engines");
    }
}
public class FlyableDemo {
    public static void main(String[] args) {
        Flyable bird=new Bird();
        bird.fly();

        Flyable aeroplane=new Aeroplane();
        aeroplane.fly();
    }
}
