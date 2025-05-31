package org11.example.collections.listInterface.arraylist;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class setMethod {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<String>();
        drinks.add(0,"lemon");
        drinks.add(1, "milk");
        drinks.add(2,"orange");
        drinks.add(3,"pineapple");

        Iterator itr=drinks.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        drinks.set(1,"mango");
        for(String ref:drinks){
            System.out.println(ref);
        }
    }
}
