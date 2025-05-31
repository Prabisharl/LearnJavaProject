package org4.example.arrays.onedimensional;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 5 elements");
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<=5;i++){
            if(a[i]<min){
                min=a[i];
                break;
            }
        }
        System.out.println("Minimum element is:"+min);
    }
}
