package org14.example.filehandling.streamAPi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTransformDemo {
    public static void main(String[] args) {

        // Sample list of fruits
        List<String> fruits = Arrays.asList("apple", "banana", "cherry");

        // FILTER: Print fruits that start with 'b'
        System.out.println("Filtered (starts with 'b'):");
        fruits.stream()
                .filter(f -> f.startsWith("b"))
                .forEach(System.out::println);

        // MAP: Convert all fruit names to uppercase and print
        System.out.println("\nMapped to Uppercase:");
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // COLLECT: Store the uppercase fruits in a new list
        List<String> upperList = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nCollected List: " + upperList);

        // REDUCE: Combine all elements into a single string
        String combined = fruits.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println("\nReduced Combined String: " + combined);
    }
}

