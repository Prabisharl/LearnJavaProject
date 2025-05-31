package org11.example.collections.listInterface.stack;

import java.util.Iterator;
import java.util.Stack;

public class pushMethod {
    public static void main(String[] args) {
        Stack<String> laptop=new Stack<String>();
        laptop.push("Lenova");
        laptop.push("Apple");
        System.out.println(laptop);

        Iterator itr=laptop.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
