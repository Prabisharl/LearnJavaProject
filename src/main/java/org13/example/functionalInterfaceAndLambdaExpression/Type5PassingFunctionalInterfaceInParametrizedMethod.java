package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Check1{
    void print(Integer p);
}
public class Type5PassingFunctionalInterfaceInParametrizedMethod {
    static void fun(Check1 c,Integer d){
        c.print(d);
    }

    public static void main(String[] args) {
       fun( d-> System.out.println("hai"),10 );
    }
}
