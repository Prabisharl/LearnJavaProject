package org10.example.abstraction.abstractclass;

abstract  class Shape{
    abstract void area();
}


class Circle extends Shape{

    double radius;

    Circle(double r){
        this.radius=r;
    }
    void area(){
        double result=3.14*radius*radius;
        System.out.println("Area of Circle = "+result);
    }
}

class Square extends Shape{

    double side;

    Square(double s){
        this.side=s;
    }

    void area(){
        double result=side*side;
        System.out.println("Area of Square = "+result);
    }

}
public class ShapesMain {
    public static void main(String[] args) {
        Shape circle=new Circle(4);
        Shape square=new Square(4);

        circle.area();
        square.area();
    }
}
