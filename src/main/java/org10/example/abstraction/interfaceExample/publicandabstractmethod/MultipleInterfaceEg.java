package org10.example.abstraction.interfaceExample.publicandabstractmethod;
interface Printable{
    void print();
}
interface Showable{
    void show();
}

public class MultipleInterfaceEg implements Printable, Showable{
    public void print(){
        System.out.println("Printing...");
    }
    public void show(){
        System.out.println("Showing....");
    }

    public static void main(String[] args) {
        MultipleInterfaceEg obj = new MultipleInterfaceEg();
        obj.print();
        obj.show();
    }
}
