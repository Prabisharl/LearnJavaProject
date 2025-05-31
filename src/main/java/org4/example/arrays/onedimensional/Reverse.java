package org4.example.arrays.onedimensional;

public class Reverse {
    public static void main(String[] args) {
        int array[]=new int[5];
        array[0]=1;
        array[1]=2;

        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);

        }
    }
}
