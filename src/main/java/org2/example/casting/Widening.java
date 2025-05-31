package org2.example.casting;

public class Widening {
    public static void main(String[] args) {
        int a=10;
        long l=a;
        System.out.println("Long:"+l);
        double d=a;
        System.out.println("Double:"+d);
    }
}
