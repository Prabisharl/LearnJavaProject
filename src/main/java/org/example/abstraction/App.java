package org.example.abstraction;

public class App 
{
    //Method to calculate total area
   public static double getTotalArea(Shape[] shapes){
        if(shapes==null){
            return 0;
        }
        double total=0;
        for(Shape shape : shapes){
            total=total+shape.calculateArea();
            System.out.println(shape.calculateArea());
        }
        return total;
    }
    public static void main( String[] args ){
        //Creating objects
        Shape objC=new Circle(5);
        Shape objR=new Rectangle(4,6);

        //Displaying areas
        System.out.println("Circle:" + objC.calculateArea());
        System.out.println("Rectangle:" + objR.calculateArea());

        //Array of Shapes
        Shape[] shapes={objC,objR};

        //Display total area
        System.out.println("Total Area:" +getTotalArea(shapes));
    }
}
