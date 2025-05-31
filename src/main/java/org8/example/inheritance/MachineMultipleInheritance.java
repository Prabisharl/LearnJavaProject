package org8.example.inheritance;

import java.util.Scanner;

interface Printable{
    void print();
}
interface Scannable{
    void scan();
}
public class MachineMultipleInheritance implements Printable, Scannable {
    public void print(){
        System.out.println("Printing document....");
    }
    public void scan(){
        System.out.println("Scanning document....");
    }

    public static void main(String[] args) {
       MachineMultipleInheritance obj = new MachineMultipleInheritance();
       obj.scan();
       obj.print();
    }
}
