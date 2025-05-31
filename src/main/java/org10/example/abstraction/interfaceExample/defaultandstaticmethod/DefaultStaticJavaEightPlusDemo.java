package org10.example.abstraction.interfaceExample.defaultandstaticmethod;

interface Greeting{
    void sayHello();
    default void sayGoodbye(){
        System.out.println("This is default non abstract method of interface, from java 8+");
    }
    static void SpecialAbout(){
        System.out.println("this is non abstract method of static method of interface, from java 8+ . But hence it is static we cannot able to create object");
    }

}
class Person implements Greeting{
    public void sayHello(){
        System.out.println("This is public method by default of interface");
    }
}
public class DefaultStaticJavaEightPlusDemo {
    public static void main(String[] args) {
        Person p=new Person();
        p.sayHello();
        p.sayGoodbye();
        Greeting.SpecialAbout(); //static method
    }
}
