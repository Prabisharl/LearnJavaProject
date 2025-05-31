package org4.example.arrays.twodimensional;

public class MatrixMultiplication {

    public static void main(String[] args) {

        //Matrix Multiplication is Possible Only When:
        //Number of Columns in A == Number of Rows in B


        int a[][]={ {1,2,3},{4,5,6},{7,8,9} }; // 3 Rows × 3 Columns
        int b[][]={ {1,2},{4,5},{5,7}}; // 3 Rows × 2 Columns

        //   Size of Result Matrix =	Rows of A × Columns of B


        int mul[][] = new int[a.length][b[0].length];
//        int mul[][]=new int[3][2];

        //a.length----->	No. of Rows
        //a[0].length------>	No. of Columns
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){

            }
        }
    }
}
