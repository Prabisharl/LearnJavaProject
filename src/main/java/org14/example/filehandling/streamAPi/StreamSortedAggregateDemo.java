package org14.example.filehandling.streamAPi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSortedAggregateDemo {
    public static void main(String[] args) {

        // List of integers
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);

        // SORT: Sort the list in ascending order and collect as a new list
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // AGGREGATE: Sum all elements in the list
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum();

        // Output the results
        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sorted);
        System.out.println("Sum of Elements: " + sum);
    }
}

