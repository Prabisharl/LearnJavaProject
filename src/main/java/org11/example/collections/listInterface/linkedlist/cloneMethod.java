package org11.example.collections.listInterface.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class cloneMethod {
    public static void main(String[] args) {
        LinkedList<String> book=new LinkedList<String>();
        book.addLast("Notebook");
        book.addLast("Textbook");
        book.addFirst("Colorbook");
        book.addFirst("Storybook");

        Iterator itr=book.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
