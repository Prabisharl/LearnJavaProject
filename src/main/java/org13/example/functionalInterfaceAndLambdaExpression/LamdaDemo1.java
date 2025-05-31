package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface B{
    void show();
}
public class LamdaDemo1 {
    public static void main(String[] args) {
        B b = ()-> {System.out.println("Hello I am LamdaDemo1");};
        b.show();
        //{System.out.println("Hello I am LamdaDemo1");};-----here dont need curly bracket because one statement
        B d = ()-> System.out.println("Hello I am LamdaDemo1");
        d.show();
    }
}
