package org4.example.arrays.onedimensional;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter five numbers:");
        int a[]=new int[5];
        for(int i=0;i<=5;i++){
           a[i]=sc.nextInt();
        }

        int max=a[0];
        for(int i=1;i<=5;i++){
            if(a[i]>max){
                max=a[i];
                break;
            }
        }
        System.out.println("Maximum element"+max);
    }
}
