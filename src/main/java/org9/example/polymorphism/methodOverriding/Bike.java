package org9.example.polymorphism.methodOverriding;
/*Same method name and parameters in parent & child classes

Achieved through inheritance

Use @Override annotation

Enables runtime polymorphism*/
class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle {
    @Override
    void run(){
        System.out.println("Car is running");
    }

}
class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        Bike bike = new Bike();
        bike.run();
    }
}
/* @Override annotation:
It ensures that the method actually overrides a superclass method

These 3 types of methods CANNOT be overridden in Java:
private	❌ No	Not visible in subclass
static	❌ No	Can be hidden, but not overridden
final	❌ No	Compiler prevents it
 */