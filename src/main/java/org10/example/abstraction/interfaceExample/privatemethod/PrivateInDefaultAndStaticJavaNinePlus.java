package org10.example.abstraction.interfaceExample.privatemethod;

/*interfaces can have:

private instance methods
private static methods*/


interface Greetings{
    //default method
    default void sayHello(){
        System.out.println("Hello, I am static method of interface");
        logcommon();
    }
    //static method
    static void sayGoodbye(){
        System.out.println("Goodbye, I am static method of interface");
        logcommon();
    }

    private static void logcommon(){
        System.out.println("This is a private method of interface");
    }
}
class PersonPrabisha implements Greetings{
    // No need to override anything unless we want to
}
public class PrivateInDefaultAndStaticJavaNinePlus {
    public static void main(String[] args) {
      PersonPrabisha p = new PersonPrabisha();
      p.sayHello();
      Greetings.sayGoodbye();
    }
}
