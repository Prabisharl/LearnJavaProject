package org11.example.collections.listInterface.vector;

import java.util.Vector;

public class addMethodfromArray {
    public static void main(String[] args) {
        int[] fruits=new int[4];
        fruits[0]=3;
        fruits[1]=5;
        fruits[2]=7;
        fruits[3]=7;

        Vector<Integer> v=new Vector<>();
        for(int i=0;i<fruits.length;i++){
            v.add(fruits[i]);
        }
        for(Integer ref:v){
        System.out.println(ref);
        }

    }

    public static class pushMethod {
        public static void main(String[] args) {

        }
    }
}
