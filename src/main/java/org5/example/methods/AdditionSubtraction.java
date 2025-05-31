package org5.example.methods;

public class AdditionSubtraction {
    void add(int a, int b){
        System.out.println("Sum is:"+(a+b) );
    }
    void sub(int a, int b){
        System.out.println("Difference is:"+(a-b) );
    }

    public static void main(String[] args) {
        AdditionSubtraction obj= new AdditionSubtraction();
        obj.add(1,2);
        obj.sub(2,3);
    }
}
