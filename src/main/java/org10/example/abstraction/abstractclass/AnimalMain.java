package org10.example.abstraction.abstractclass;

abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog says:Woof!");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat says:Meow!");
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.sound();
        Animal cat=new Cat();
        cat.sound();
    }
}
