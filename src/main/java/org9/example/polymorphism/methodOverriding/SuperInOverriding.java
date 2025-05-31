package org9.example.polymorphism.methodOverriding;
class Shape{
    void area(){
        System.out.println("Area of Shape");
    }
}
class Rectangle extends Shape{
    int length=4;
    int breadth=5;

    @Override
    void area(){
        super.area();
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
public class SuperInOverriding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
    }
}
