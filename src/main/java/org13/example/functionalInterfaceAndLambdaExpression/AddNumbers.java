package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface Add{
    int add(int n1,int n2);
}
public class AddNumbers {
    public static void main(String[] args) {

       Add obj=(n1,n2)->{
            System.out.println(n1+n2);
            return n1+n2;
        } ;
        obj.add(10,20);
    }
}
