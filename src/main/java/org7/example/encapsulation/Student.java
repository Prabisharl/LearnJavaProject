package org7.example.encapsulation;

public class Student {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Student s=new Student();

        s.setAge(20);
        System.out.println(s.getAge());

        s.setName("John");
        System.out.println(s.getName());

    }

}
