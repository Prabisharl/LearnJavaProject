package org10.example.abstraction.interfaceExample.privatemethod;

//A default method calling a private instance method

interface Screen{
    default void show(){
        System.out.println("Inside Default method, calling private instance method");
        log();           //Calls private helper method
    }
    private void log(){
        System.out.println("Private instance method is executed");
    }
}
public class PrivateInDefaultJavaNinePlus implements Screen{
    // Inherits the default 'show' method


    public static void main(String[] args) {
        PrivateInDefaultJavaNinePlus p = new PrivateInDefaultJavaNinePlus();
        p.show();// Output includes private method via default method
    }
}
