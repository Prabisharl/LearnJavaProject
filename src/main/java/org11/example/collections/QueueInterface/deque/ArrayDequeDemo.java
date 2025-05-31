package org11.example.collections.QueueInterface.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> d=new ArrayDeque<>();
        d.add("For");
        d.add("To");
        d.addFirst("I");
        d.push("Me");
        System.out.println(d);
    d.pop(); //remove & retrive
        System.out.println(d);
        d.poll();
        System.out.println(d);
    }
}
