package org7.example.encapsulation;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Car {
    private int speed;


//    public int getSpeed(){
//        return speed;
//    }
//    public void setSpeed( int speed){
//        if(speed>=0){
//            this.speed=speed;
//        }else{
//            System.out.println("Speed cannot be negative");
//        }
//    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(10);
        System.out.println("Car speed:"+car.getSpeed()+"km/h");

    }
}
