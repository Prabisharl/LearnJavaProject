package org11.example.collections.listInterface.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class addAll {
    public static void main(String[] args) {
        LinkedList<Integer> time=new LinkedList<Integer>();
        time.add(1);
        time.add(2);
        time.add(3);
        time.add(4);
        Iterator itr=time.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        LinkedList<Integer> peekTime=new LinkedList<Integer>();
        peekTime.add(5);
        peekTime.add(6);
        peekTime.add(7);
        peekTime.add(8);
        for(Integer ref:peekTime){
            System.out.println(ref);
        }
        peekTime.addAll(4,time);
        System.out.println(peekTime);

        System.out.println(time.get(0));


    }
}
