package org9.example.polymorphism.methodOverriding;
class Animal{
    void sound(){
        System.out.println("Sound of animal");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Animal a;

        a=new Dog();
        a.sound();

        a=new Cat();
        a.sound();
    }
}

/* Dynamic Method Dispatch:
Use a superclass reference to call the methods and show dynamic method dispatch*/


/*Dynamic Method Dispatch is a mechanism in Java where a superclass reference variable is used to refer to a subclass object, and the method call is resolved at runtime.
It is used to achieve runtime polymorphism.*/

/*Only overridden methods are dispatched dynamically.
Instance variables are not polymorphic — they depend on reference type.
Helps in flexible code — parent reference can work with multiple child types.*/