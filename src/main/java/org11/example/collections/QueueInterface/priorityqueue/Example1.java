package org11.example.collections.QueueInterface.priorityqueue;

import java.util.PriorityQueue;
//compares strings character by character based on Unicode values.

public class Example1 {
    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        pq.add("in");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
//        pq.remove("Geeks");
//
//        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.remove());

        System.out.println("Final PriorityQueue: " + pq);
    }
}