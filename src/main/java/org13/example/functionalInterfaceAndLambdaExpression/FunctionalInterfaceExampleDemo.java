package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface A{
    void show();
}
public class FunctionalInterfaceExampleDemo {
    public static void main(String[] args) {
        //anonymous class not instationting interface here
        A obj=new A(){
            public void show(){
                System.out.println("Hello Functional Interface Implementation");
            }
        };
        obj.show();
    }
}
