package org9.example.polymorphism.methodOverloading;

public class StringConcatenator {
    String combine(String a, String b){
        return a+b;
    }

    String combine(String a, int b){
        return a+b;
    }
    String combine(String a, String b,String c) {
        return a + b + c;
    }
    String combine(String a, String b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        StringConcatenator s = new StringConcatenator();
        System.out.println(s.combine("Hello ", "Prabisha"));
        System.out.println(s.combine("Age ", 26));
        System.out.println(s.combine("You ", "are ","JavaFullstack"));
        System.out.println(s.combine("Your ", "number ", 44));

    }
}
