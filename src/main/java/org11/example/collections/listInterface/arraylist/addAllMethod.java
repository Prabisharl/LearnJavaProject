package org11.example.collections.listInterface.arraylist;

import java.util.ArrayList;

/*There are two versions of the ArrayList addAll() method, i.e., one that appends elements at the end of the list and another that inserts elements at a specified position in the list.

addAll(Collection C):
The addAll() method in the ArrayList class is used to add all the elements from a specified collection into an ArrayList.
This method is especially useful for combining collections or inserting multiple elements at once.

addAll(int index, Collection C):
 It inserts all elements from the specified collection into the ArrayList at the specified index.
 It shifts the current elements and subsequent elements to the right.

 */
public class addAllMethod {
    public static void main(String[] args) {
        ArrayList<String> weeks=new ArrayList<String>();
        weeks.add(0,"Sunday");
        weeks.add(1,"Monday");
        weeks.add(2,"Tuesday");
        weeks.add(3,"Wednesday");
        System.out.println(weeks);

        ArrayList<String> days=new ArrayList<String>();
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        //Adding all elements from weeks
        days.addAll(weeks);
        System.out.println(days);
    }
}
