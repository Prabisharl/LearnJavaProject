package org9.example.polymorphism.methodOverriding;
class Employee{
    double baseSalary=30000;
    double calculateSalary(){
        return baseSalary;
    }
}


class Manager extends Employee{
    double bonus=20000;
    @Override
    double calculateSalary(){
        return baseSalary+bonus;
    }
}


class Developer extends Employee{
    double bonus=10000;
    @Override
    double calculateSalary(){
        return baseSalary+bonus;
    }
}


class Tester extends Employee{
    double bonus=6000;
    @Override
    double calculateSalary(){
        return baseSalary+bonus;
    }
}


public class FindSalary {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Manager man=new Manager();
        Developer dev=new Developer();
        Tester tes=new Tester();

        System.out.println("The Employee salary for Rahaeil: "+emp.calculateSalary());
        System.out.println("The Employee salary for Harry potter: "+emp.calculateSalary());
        System.out.println("The Employee salary for Gingsun: "+emp.calculateSalary());


        System.out.println("The Manager salary for Gloury: "+man.calculateSalary());
        System.out.println("The Manager salary for Vicky John: "+man.calculateSalary());

        System.out.println("The Developer salary for Jehan: "+dev.calculateSalary());

        System.out.println("The Tester salary for Foughjael: "+tes.calculateSalary());
    }
}
