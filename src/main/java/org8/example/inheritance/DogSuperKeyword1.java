package org8.example.inheritance;
/* Useful: When You override a method but still want to call the parent version.
or You want to extend or customize parent behavior.*/



class Animals{
    //parent variable
    String type="Animal";
    //parent method
    void sound(){
        System.out.println("Animals makes a sound");
    }
    //parent default constructor
    Animals(){
        System.out.println("Animals default constructor");
    }
    //parent parametrized constructor
    Animals(String type){
        System.out.println("Animals parametrized constructor "+type);
    }


}
public class DogSuperKeyword1 extends Animals {
    //child variable with same parent variable name
    String type="Dog";

    //method for calling variables
    void showType(){
        System.out.println("Child Dog Type: "+type);
        System.out.println("Parent Animal type: "+super.type);
    }
    //child method with same parent method name
    void sound(){
         // Call parent method......Can only access immediate parent methods
        System.out.println("dog barks");
        super.sound();
    }
    //default constructor
    DogSuperKeyword1(){
//        super(); //Can't call multiple parent constructors directly
        super("Tommy");
        System.out.println("Child default constructor");


    }
    DogSuperKeyword1(String type){
        super("Tommy");
        System.out.println("Child parametrized constructor");
    }
    //parametrized constructor
    public static void main(String[] args) {
        DogSuperKeyword1 d=new DogSuperKeyword1();
//        DogSuperKeyword d1=new DogSuperKeyword("Parametrized child");
        d.showType();
        d.sound();
    }
}
/*super() in constructor must be first line:
You can only use one super() call and it must be the first statement

super in methods need not be in first line:
You can use super anywhere inside a method — it does not have to be the first line.

One call per constructor:
Can't call multiple parent constructors directly

Use constructor chaining:
Use this() in parent class to chain constructors*/

/*Default constructor in parent class call automatically in child class too but..... If we didnt mention default constructor and instead of that we mention parametrized constructor, only parameterized constructor will work/*

If you define any constructor in the parent (especially a parameterized one), Java does NOT create the default constructor for you.
 */
