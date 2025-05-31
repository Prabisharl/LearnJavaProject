package org10.example.abstraction.interfaceExample.publicandabstractmethod;
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}
class Truck implements Vehicle{
    public void start(){
        System.out.println("Truck is starting");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car=new Car();
        Vehicle bike=new Bike();
        Vehicle truck=new Truck();
        car.start();
        bike.start();
        truck.start();

    }
}
