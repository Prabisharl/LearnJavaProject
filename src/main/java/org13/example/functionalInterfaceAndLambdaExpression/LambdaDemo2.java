package org13.example.functionalInterfaceAndLambdaExpression;
@FunctionalInterface
interface C{
    void show(int i);

}
public class LambdaDemo2 {
    public static void main(String[] args) {
        C c = (int i) -> System.out.println("Hello I am Lambda2:"+ i);
        c.show(5);

        //(int i) -----here don't need brackets and int datatype because only one variable is passing

        C d =i -> System.out.println("Hello I am Lambda2:"+ i);
        d.show(5);
    }
}
