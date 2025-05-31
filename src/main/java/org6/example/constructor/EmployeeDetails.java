package org6.example.constructor;

public class EmployeeDetails {
    int empId;
    String empName;
    double empSalary;

    EmployeeDetails(int id,String name,double salary){
        empId=id;
        empName=name;
        empSalary=salary;
    }
    void display(){
        System.out.println("Name: "+empName);
        System.out.println("ID: "+empId);
        System.out.println("Salary: "+empSalary);

    }

    public static void main(String[] args) {
        EmployeeDetails employer1=new EmployeeDetails(1,"John Doe",50000);
        EmployeeDetails employer2=new EmployeeDetails(2,"Jane Doe",70000);

        employer1.display();
        employer2.display();
    }
}
