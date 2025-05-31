package org9.example.polymorphism.methodOverloading;
//Can differ by:
//
//Number of parameters
//
//Type of parameters
//
//Sequence of parameters
public class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    double add(int a,double b){
        return a+b;
    }
    double add(double a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2)); // int, int
        System.out.println(calculator.add(1.5,2)); // double, double
        System.out.println(calculator.add(1,2.5)); // int, double
        System.out.println(calculator.add(1.5,2));// double, int
    }
}
