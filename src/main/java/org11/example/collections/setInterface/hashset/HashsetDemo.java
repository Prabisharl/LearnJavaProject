package org11.example.collections.setInterface.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args)
    {
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> s = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        s.add("Geeks");
        s.add("For");
        s.add("Geeks");
        s.add("Example");
        s.add("Set");

        // Printing elements of HashSet object
        System.out.println(s);
    }
}
