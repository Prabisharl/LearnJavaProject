package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Operations{
    int digits(int a,int b);
}
public class Type3MultipleParameterLambda {
    public static void main(String[] args) {
        Operations add=(a,b)->a+b;
        System.out.println(add.digits(1,2));

        Operations mul=(a,b)->a*b;
        System.out.println(mul.digits(1,2));
    }
}
