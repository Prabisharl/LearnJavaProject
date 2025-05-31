package org11.example.collections.listInterface.stack;

import java.util.Stack;

public class peekMethod {
    public static void main(String[] args) {
        Stack<String> ink=new Stack<String>();
        ink.push("blue");
        ink.push("black");
        ink.push("red");
        ink.peek();
        System.out.println(ink.peek());
        for(String ref:ink){
            System.out.println(ref);
        }
    }
}
