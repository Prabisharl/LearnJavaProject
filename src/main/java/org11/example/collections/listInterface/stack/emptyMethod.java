package org11.example.collections.listInterface.stack;

import java.util.Stack;

public class emptyMethod {
    public static void main(String[] args) {
        Stack<String> ink=new Stack<String>();
        ink.push("blue");
        ink.push("black");
        ink.push("red");
        ink.pop();
        ink.pop();
        ink.pop();
        System.out.println(ink.empty());
    }
}
