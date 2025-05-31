package org11.example.collections.sortMethods.logicsorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int rollno;
    int age;

    public Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                '}';
    }
}
public class Type3Class {
    public static void main(String[] args) {
        Comparator<Student> c=new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if(s1.rollno>s2.rollno) {
                    return 1;
                }else{
                    return -1;
                }
            }

        };

        List<Student> list=new ArrayList<Student>();
        list.add(new Student("Jack",3,20));
        list.add(new Student("Rani",5,20));
        list.add(new Student("Hima",1,21));
        list.add(new Student("Rahan",2,21));

        Collections.sort(list,c);
        System.out.println(list);

    }
}
