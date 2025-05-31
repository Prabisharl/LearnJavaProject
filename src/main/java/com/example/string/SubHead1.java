package com.example.string;

public class SubHead1 {
    int a=3; // Instance variable
    int b=10;// Instance variable


    void sum(){
        int c=a+b; /* Accessing instance variables directly
                                   They belong to an object, not the class itself.
                                   Accessing Without Parameters
                                   Inside the sum() method, a and b are used directly because they belong to the object.
                                   In main(), we access them using obj.a and obj.b.*/

        System.out.println(c);
    }

    int getSum(){

        return a+b;
    }
}
