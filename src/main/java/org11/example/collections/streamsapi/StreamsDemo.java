package org11.example.collections.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
        nums.forEach(n-> System.out.println(n));
        // Using streams to filter and print even numbers
        Stream<Integer> s1=nums.stream();// its datatype is stream object so give a new stream so saved in new stream to get output
//      s1.forEach(n-> System.out.println(n));//cant able to print or reuse it multiple times

        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0,(a,b)->a+b);
        System.out.println("Stream result" +result);

        //using one line
//        int result=nums.stream()
//                .filter(n->n%2==0)
//                        .map(n->n*2)
//                                .reduce(0,(a,b)->a+b);
//        System.out.println("Stream result" +result);
//

    //original code
        nums.forEach(n-> System.out.println(n));



    }
}
