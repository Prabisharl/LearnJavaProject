package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Valid{
    void valid(Integer v1, Integer v2);
}

public class Type6PassingFunctionalInterfaceInMultipleParametrizedMethod {
    static void fun(Valid v, Integer v1, Integer v2) {
        v.valid(v1, v2);
    }

    public static void main(String[] args) {
        fun((v1, v2) -> System.out.println("Hello"), 3, 4);
    }
}
