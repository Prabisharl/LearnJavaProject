package org8.example.inheritance;

class Person{
    void showPerson(){
        System.out.println("I am a Person");
    }
}
class Employee extends Person{
    void showEmployee(){
        System.out.println("I am a Employee");
    }
}
public class ManagerMultilevelInheritance extends Employee{
    void showManager(){
        System.out.println("I am a Manager");
    }

    public static void main(String[] args) {
        ManagerMultilevelInheritance m = new ManagerMultilevelInheritance();
        m.showPerson();   // From Person
        m.showEmployee(); // From Employee
        m.showManager();  // From Manager

    }
}
