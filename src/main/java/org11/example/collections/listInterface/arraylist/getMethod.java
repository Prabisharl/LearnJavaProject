package org11.example.collections.listInterface.arraylist;

import java.util.ArrayList;

public class getMethod {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("yellow");

        System.out.println(colors.get(0));
    }
}
