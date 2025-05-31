package org9.example.polymorphism.methodOverloading;

public class PrintUtility {

    void print(int value){
        System.out.println(value);
    }
    void print(double value) {
        System.out.println("Double: " + value);
    }
    void print(String value) {
        System.out.println("String: " + value);
    }
    void print(boolean value) {
        System.out.println("Boolean: " + value);
    }

    public static void main(String[] args) {
        PrintUtility pu = new PrintUtility();

        pu.print(100);
        pu.print(45.67);
        pu.print("Hello Java");
        pu.print(true);
    }
}
