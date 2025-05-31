package org7.example.encapsulation;

public class Employee {
    private double salary;

    //Getter for salary
    public double getSalary(){
        return salary;
    }
   // Setter with validation
    public void setSalary(double salary){
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount. Salary must be non-negative.");
        }
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setSalary(500);
        System.out.println(e.getSalary());
        e.setSalary(-5000);

    }
}
