package org11.example.collections.listInterface.arraylist;
//clear():
//This method is used to remove all the elements from any list.

/*clear elements from an ArrayList of Integers.
clear elements from an ArrayList of Strings.
clear elements from an ArrayList of Objects.*/

import java.util.ArrayList;
import java.util.Iterator;

public class clearMethod {

    public static void main(String[] args) {
        ArrayList<Integer> fruits=new ArrayList<Integer>();
        fruits.add(10);
        fruits.add(20);
        fruits.add(30);
        fruits.add(40);
        System.out.println(fruits);
        for (Integer itr:fruits){
            System.out.println(itr);
        }
        Iterator itrt=fruits.iterator();
        while(itrt.hasNext()){
            System.out.println(itrt.next());
        }

        fruits.clear();
        System.out.println(fruits);


    }
}
