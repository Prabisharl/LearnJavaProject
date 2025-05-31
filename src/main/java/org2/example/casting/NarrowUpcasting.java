package org2.example.casting;
//subtype to a supertype

class Animal{
    protected void makeSound(){
        System.out.println("Making sound from supertype class");
    }
}

class Dog extends Animal{

    protected void makeSound(){
        System.out.println("Dog making sound from subtype class");
    }
    protected void makeFetch(){
        System.out.println("Fetching dont have reference from supertype class so cant able to call by making superclass as reference variable when object creating");
    }

}

public class NarrowUpcasting {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();

        /*Dog obj2=new Dog();
        obj2.makeFetch();*/

        /*Explicit downcasting
        Dog obj2=(Dog)obj;
        obj2.makeFetch();*/
    }


}
