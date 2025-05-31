package org11.example.collections.setInterface.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(5);
        t.add(2);
        t.add(8);
        t.add(6);
        t.add(2);//since duplicate elements so removed by it.Not displayed in console while printing
        System.out.println(t);
        t.remove(2);
        System.out.println(t);//Output:[5, 6, 8]
    }
}
