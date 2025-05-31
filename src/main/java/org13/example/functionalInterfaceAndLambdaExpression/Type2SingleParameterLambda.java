package org13.example.functionalInterfaceAndLambdaExpression;

import java.util.ArrayList;

public class Type2SingleParameterLambda {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        // Using lambda expression to print all elements
        l.forEach(n-> System.out.println(n));

        // Using lambda expression to print even elements
        l.forEach(n->{
            if(n%2==0)
                System.out.println(n);
        });
    }
}
