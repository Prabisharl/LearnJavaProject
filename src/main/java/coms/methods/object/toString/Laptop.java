package coms.methods.object.toString;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

class Lenova{
    String model;
    int price;




}
public class Laptop {
    public static void main(String[] args) {
        Lenova obj1=new Lenova();
        obj1.model="Lenova";
        System.out.println(obj1);

        Lenova obj2=new Lenova();
        obj2.model="Lenova";
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
    }
}
