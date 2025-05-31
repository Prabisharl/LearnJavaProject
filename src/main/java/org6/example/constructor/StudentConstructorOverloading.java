package org6.example.constructor;

public class StudentConstructorOverloading {
    String name;
    int age;

    StudentConstructorOverloading(){
        name="Unknown";
        age=0;
    }
    StudentConstructorOverloading(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        StudentConstructorOverloading obj=new StudentConstructorOverloading();
        obj.show();

        StudentConstructorOverloading student1=new StudentConstructorOverloading("Jophn", 20);
        student1.show();
    }
}
