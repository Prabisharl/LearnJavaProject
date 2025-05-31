package org10.example.abstraction.abstractclass;

//abstract class
abstract class Employee{
    //instance variables
    String name;
    int id;
    //constructor of abstract class
    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    //concrete method
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
    //abstract method
    abstract double calculateSalary();

}

class FullTimeEmployee extends Employee{
    double monthlySalary;
    double bonus;

    FullTimeEmployee(String name, int id, double monthlySalary, double bonus){
        super(name, id);
        this.monthlySalary=monthlySalary;
        this.bonus=bonus;
    }

    @Override
    double calculateSalary(){
        return monthlySalary+bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    double bonus;


    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked, double bonus) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary(){
        return ((hourlyRate*hoursWorked)+bonus);
    }

}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp;

        emp=new FullTimeEmployee("Alice",101,50000,20000);
        System.out.println(emp.calculateSalary());
        emp.display();

        emp=new PartTimeEmployee("Maha",102,200,30,10000);
        System.out.println(emp.calculateSalary());
        emp.display();
    }
}


