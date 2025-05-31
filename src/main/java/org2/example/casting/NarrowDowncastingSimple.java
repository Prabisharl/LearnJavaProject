package org2.example.casting;
class AnimalA{
    protected void eat(){
        System.out.println("The animal is eating");
    }
}
class CatA extends AnimalA{
   protected void meow(){
        System.out.println("Cat is meowing");
    }
}
public class NarrowDowncastingSimple {
    public static void main(String[] args) {
        AnimalA aniA=new CatA();
        aniA.eat();

        //Explicit downcasting
        CatA catA=(CatA)aniA;
        catA.meow();
    }
}
