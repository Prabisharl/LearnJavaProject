package org14.example.filehandling.serialization;

import org6.example.constructor.StudentConstructorOverloading;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;

    Student(){
        name="Unknown";
        age=0;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.show();

        Student student1=new Student("Jophn", 20);
        student1.show();
    }
}
