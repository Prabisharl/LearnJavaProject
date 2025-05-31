package org11.example.collections.sortMethods.normalsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(1);
        l.add(4);
        l.add(3);
        Collections.sort(l);
        System.out.println(l);

    }
}
