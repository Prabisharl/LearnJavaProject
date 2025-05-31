package org11.example.collections.listInterface.arraylist;
import java.util.*;
/*There are two versions of the ArrayList add() method i.e. one without specifying an index and another with a specified index.

1)add(Object o)
This method is used to append a specific element to the end of a list.

2)add(int index, Object element)
This method inserts the specified element at a given position in the ArrayList.
It shifts the current element at that position and subsequent elements to the right.
 */
public class addMethod {
    public static void main(String[] args) {
        //Creating an empty arraylist
        ArrayList<Integer> calender=new ArrayList<Integer>();

        calender.add(1);
        calender.add(3);
        calender.add(4);
        calender.add(5);
        System.out.println("Calender: "+calender);

        //Adding new element at index 2;
        int i=1;
        calender.add(i,2);
        System.out.println("updated Calender: "+calender);

    }
}
