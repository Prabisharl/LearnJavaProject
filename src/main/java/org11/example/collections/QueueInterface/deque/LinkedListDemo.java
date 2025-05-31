package org11.example.collections.QueueInterface.deque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Deque<String> d = new LinkedList<>();

        d.add("ELement1(Tail)"); //Add at last
        d.addLast("ELement2(Tail)");//Add at last
        d.offer("ELement3(Tail)");//Add at last
//
        d.addFirst("Element4(Head)");//Add at first
        d.push("Element5(Head)");
        d.offerFirst("Element6(Head)");
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);


    }
}