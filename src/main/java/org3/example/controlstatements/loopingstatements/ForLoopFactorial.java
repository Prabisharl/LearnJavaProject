package org3.example.controlstatements.loopingstatements;

import java.util.Scanner;

public class ForLoopFactorial {
    public static void main(String[] args) {
        int limit=5;
        int fact=1;

        for(int i=1;i<=limit;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
