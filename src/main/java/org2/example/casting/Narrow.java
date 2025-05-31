package org2.example.casting;

public class Narrow {
    public static void main(String[] args) {
        double d=100.245;
        short s= (short)d;
        System.out.println("Short:"+s);
        int i=(int)d;
        System.out.println("Int:"+i);
    }
}
