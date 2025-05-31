package org4.example.arrays.twodimensional;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a[][]=new int[3][3];
        System.out.println("Enter first matrix elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        int b[][]=new int[3][3];
        System.out.println("Enter second matrix elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }

        int sum[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Matrix Addition :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
