package org4.example.arrays.twodimensional;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][]=new int[3][3];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element to be search");
        int key=sc.nextInt();
        boolean found=false;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j]==key){
                    found=true;
                    System.out.println("Element found at position: "+i +j );
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }

    }
}
