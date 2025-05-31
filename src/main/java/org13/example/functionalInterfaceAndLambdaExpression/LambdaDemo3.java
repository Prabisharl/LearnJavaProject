package org13.example.functionalInterfaceAndLambdaExpression;

@FunctionalInterface
interface D{
    int add(int i, int j);
}
public class LambdaDemo3 {
    public static void main(String[] args) {

//        D obj=(int i, int j)->
//                return i + j;

        // return i + j;-----here return will bring error because it is returning expression so dont need return.
        //(int i, int j)-----here dont need int datatype but need brackets beacuse it have two variables


        D obj=(i, j)->  i + j;

        int result=obj.add(1,2);
        System.out.println(result);
    }

}
