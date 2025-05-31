package org.example.abstraction;

public class Circle extends Shape {
    private double radius;

    //constructor
    public Circle(double radius){
      this.radius=radius;
    }

    //implement abstract method
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
