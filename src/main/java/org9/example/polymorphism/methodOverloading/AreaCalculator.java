package org9.example.polymorphism.methodOverloading;


public class AreaCalculator {
    //Area of Circle
    double area(double radius){
        return Math.PI*radius*radius;
    }

    //Area of Rectangle
    double area(double length, double height){
        return length*height;
    }

    //Area of Triangle
    double area(double base, double height, boolean isTriangle){
        if(isTriangle){
            return 0.5*base*height;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of circle is "+calculator.area(5));
        System.out.println("Area of rectangle is "+calculator.area(10,20));
        System.out.println("Area of triangle is "+calculator.area(10,20,true));
    }
}
