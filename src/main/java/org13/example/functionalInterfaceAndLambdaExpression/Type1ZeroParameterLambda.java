package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Zero{
    void display();
}
public class Type1ZeroParameterLambda {
    public static void main(String[] args) {
        Zero z=()
                -> System.out.println("Hello Zero parameter");
        z.display();
    }
}
