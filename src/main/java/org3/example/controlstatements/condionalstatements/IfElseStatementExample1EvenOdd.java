package org3.example.controlstatements.condionalstatements;

import java.util.Scanner;

public class IfElseStatementExample1EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0) {
            System.out.println(num + "is even");
        }
        else{
            System.out.println(num+"is odd");
        }
    }
}
