package org8.example.inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle start");
    }
}

class Car extends Vehicle {
    void carSound() {
        System.out.println("Car sound");
    }
}

public class BikeHierarchicalInheritance extends Vehicle {
    void bikeSound() {
        System.out.println("Bike sound");
    }

    public static void main(String[] args) {

        BikeHierarchicalInheritance bike = new BikeHierarchicalInheritance(); //object for bike
        bike.start();
        bike.bikeSound();

        Car car = new Car(); //object for car
        car.start();
        car.carSound();

    }
}
