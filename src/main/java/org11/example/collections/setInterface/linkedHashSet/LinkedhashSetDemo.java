package org11.example.collections.setInterface.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

    public static void main(String[] args) {

        // Creating an empty LinekdhashSet of string type
        LinkedHashSet<String> lh
                = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");
        lh.add("A");
        lh.add("B");
        lh.add("Z");

        System.out.println("" + lh);

        // Removing the element from above Set
        lh.remove("B");

        // Again removing the element
        System.out.println("After removing element " + lh);

        // Returning false if the element is not present
        System.out.println(lh.remove("AC"));
        //iterating
        Iterator<String> itr=lh.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //enhanced for loop
        for(String s:lh){
            System.out.println(s);
        }

    }
}
