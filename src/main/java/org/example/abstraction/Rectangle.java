package org.example.abstraction;

public class Rectangle extends Shape {
    private double length, width;

    //constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //implement abstract method
    public double calculateArea(){
        return length*width;
    }
}