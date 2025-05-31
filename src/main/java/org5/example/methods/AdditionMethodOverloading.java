package org5.example.methods;

public class AdditionMethodOverloading {
    void add(int a, int b){
        System.out.println("Addition is:"+(a+b));
    }

    void add(double a, double b){
        System.out.println("Addition is:"+(a+b));
    }

    void add(int a,int b, int c){
        System.out.println("Addition is:"+(a+b+c));
    }

    void add(int a, double b, int c){
        System.out.println("Addition is:"+(a+b+c));
    }

    void add(int a, int b, double c){
        System.out.println("Addition is:"+(a+b+c));
    }


    public static void main(String[] args) {
        AdditionMethodOverloading obj = new AdditionMethodOverloading();
        obj.add(1,2);
        obj.add(2.5,4.5);
        obj.add(1,2,3);
        obj.add(2,3.5,2);
        obj.add(1,2,3.5);
    }
}
