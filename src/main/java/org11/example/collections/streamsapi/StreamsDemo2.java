package org11.example.collections.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class StreamsDemo2 {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,5,1,4,3);
        Stream<Integer> s=l.stream()
        .filter(n->n%2==0)
                .sorted();
        s.forEach(n-> System.out.println(n));
    }
}
