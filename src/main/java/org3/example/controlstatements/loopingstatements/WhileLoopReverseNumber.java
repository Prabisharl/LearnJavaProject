package org3.example.controlstatements.loopingstatements;

import java.util.Scanner;

public class WhileLoopReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number");
        int num=sc.nextInt();

        int rev = 0;

        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + rev);

    }
}