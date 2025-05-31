package org11.example.collections.listInterface.stack;

import java.util.Stack;

public class searchMethod {
    public static void main(String[] args) {
        Stack<String> ink=new Stack<String>();
        ink.push("blue");
        ink.push("black");
        ink.push("red");
        System.out.println(ink.search("red"));
        System.out.println(ink.search("blue"));
        System.out.println(ink.search("black"));
    }
}
