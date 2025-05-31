package org8.example.inheritance;
class Student{
    void displayName(){
        System.out.println("Name:Prabisha");
    }
}
public class MarksSingleInheritance extends Student{
    void displayMarks(){
        System.out.println("Marks:91");
    }

    public static void main(String[] args) {
        MarksSingleInheritance m = new MarksSingleInheritance();
        m.displayName();// From Student
        m.displayMarks(); // From Marks
    }
}
