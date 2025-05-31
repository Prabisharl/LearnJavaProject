package org3.example.controlstatements.condionalstatements;

import java.util.Scanner;

public class IfElseIfLadderExample1PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0){
            System.out.println(num+"is positive");
        }else if(num<0){
            System.out.println(num+"is negative");
        }else{
            System.out.println(num+"is zero");
        }
    }
}
