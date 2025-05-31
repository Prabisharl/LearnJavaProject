package org10.example.abstraction.interfaceExample.publicandabstractmethod;
interface RemoteControl{
    void turnOn();
    void turnOff();
}
class Television implements RemoteControl{
   public void turnOn(){
       System.out.println("Tv is turned on");
   }
   public void turnOff(){
       System.out.println("Tv is turned off");
   }
}

class AC implements RemoteControl{
    public void turnOn(){
        System.out.println("AC is turned on");
    }
    public void turnOff(){
        System.out.println("AC is turned off");
    }
}

class Fan implements RemoteControl{
    public void turnOn(){
        System.out.println("Fan is turned on");
    }
    public void turnOff(){
        System.out.println("Fan is turned off");
    }
}
public class RemoteControlDemo {
    public static void main(String[] args) {
        RemoteControl tv = new Television();
        RemoteControl ac= new AC();
        RemoteControl fan = new Fan();

        tv.turnOn();
        ac.turnOn();
        fan.turnOn();

        tv.turnOff();
        ac.turnOff();
        fan.turnOff();
    }
}
