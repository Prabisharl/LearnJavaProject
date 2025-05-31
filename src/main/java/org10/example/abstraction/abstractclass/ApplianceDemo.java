package org10.example.abstraction.abstractclass;

abstract class Appliance{
    String brand;
    public Appliance(String brand){
        this.brand=brand;
    }
    abstract void turnOn();

    void showBrand(){
        System.out.println(brand);
    }
}

class Fan extends Appliance{
    public Fan(String brand){
        super(brand);
    }

    @Override
    void turnOn(){
        System.out.println("Turning on fan");
    }

}

class Light extends Appliance{
    public Light(String brand){
        super(brand);
    }
    @Override
    void turnOn(){
        System.out.println("Turning on light");
    }
}
public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance fan=new Fan("Usha");
        fan.showBrand();

        Appliance light=new Light("Philips");
        light.showBrand();
    }
}
