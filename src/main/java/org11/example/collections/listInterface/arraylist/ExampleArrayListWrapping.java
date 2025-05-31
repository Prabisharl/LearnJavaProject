package org11.example.collections.listInterface.arraylist;

import java.util.ArrayList;

public class ExampleArrayListWrapping {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);  /*
        Here Primitive int is passed.
        Autoboxing occurs — Java automatically converts int to Integer by calling Integer.valueOf(1) internally.
        Cleaner and preferred way when readability and simplicity matter.*/
        num.add(Integer.valueOf(1));
        /*You explicitly convert the int value 1 to an Integer object using the static method.
         No autoboxing here — you do the boxing yourself.
         Manual boxing occurs.
         */

        System.out.println(num.get(0));
        // Auto-unboxing
        //Java automatically calls .intValue() behind the scenes.
        //Return Type-Integer
        //t’s a wrapper class object.

        System.out.println(num.get(0).intValue());
        //Return type-int
        //Primitive value from the Integer
        //Calls the .intValue() method on the Integer object.
    }
}
