package org2.example.casting;
class Animals{
    protected void makeSound(){
        System.out.println("Making sound from supertype class");
    }
}

class Dogs extends Animals{
    int age;
    protected void makeSound(){
        System.out.println("Dog making sound from subtype class");
    }
    protected void makeFetch(){
        System.out.println("Fetching dont have reference from supertype class so cant able to call by making superclass as reference variable when object creating");
    }
    protected void setAge(int age){
        this.age=age;
    }
    protected int getAge(){
        return age;
    }
}
class Cat extends Animals{
    int age;
    protected void makeSound(){
        System.out.println("Cat making sound from subtype class");
    }
    protected void makeFetch(){
        System.out.println("Fetching dont have reference from supertype class so cant able to call by making superclass as reference variable when object creating");
    }
    protected void setAge(int age){
        this.age=age;
    }
    protected int getAge(){
        return age;
    }
}
public class NarrowDowncasting {
    public static void main(String[] args) {

        Dogs obj=new Dogs();
        //obj2.setAge(Integer.parseInt(args[0]));
        obj.setAge(10);
        display(obj);

        Cat obj2=new Cat();
        obj2.setAge(10);
        display(obj2);
    }
    public static void display(Animals abc){
        abc.makeSound();
        /*now we want to call the methods belongs to only dog not have any reference in Animal super class*/
        if(abc instanceof Dogs) {
            Dogs castDog = (Dogs) abc;
            System.out.println(castDog.getAge());
        }
        abc.makeSound();
        /*now we need to call the methods belong to only cat not have any reference in Animal super class*/
        if(abc instanceof Cat) {
            Cat castCat = (Cat) abc;
            System.out.println(castCat.getAge());
        }


}}
//
//public class  NarrowDowncasting {
//    public static void main(String[] args) {
//        Animals obj = new Dogs();
//        obj.makeSound();
//
//
//        Dogs obj2= new Dogs();
//        obj2.setAge(10);
//        print(obj2);
//    }
//
//    private static void print(Animal obj){
//        obj.makeSound();
//
//        Dogs obj2=(Dogs)obj;
//        obj2.makeFetch();
//        System.out.println(obj2.getAge());
//
//
//
//    }
//}
