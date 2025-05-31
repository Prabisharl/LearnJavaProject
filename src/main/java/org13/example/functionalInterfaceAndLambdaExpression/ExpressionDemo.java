package org13.example.functionalInterfaceAndLambdaExpression;

import java.util.Collections;
import java.util.Comparator;

@FunctionalInterface
interface NumericTest{
    boolean test(int n, int d);
}
public class ExpressionDemo {
    public static void main(String[] args) {
        NumericTest t=(n,d)->(n%d)==0;
        System.out.println( t.test(10,5));
    }
}
