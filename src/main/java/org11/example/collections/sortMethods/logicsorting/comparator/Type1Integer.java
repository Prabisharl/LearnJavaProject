package org11.example.collections.sortMethods.logicsorting.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//comparator is an interface so we can implement that through anaonymous class
//since it is comparing list , so list is under collections, so use integer not int as a parameter of compartor
public class Type1Integer {
    public static void main(String[] args) {
    Comparator<Integer> c=new Comparator<Integer>(){
        public int compare(Integer a, Integer b){
            if(a%10>b%10)
                return 1;
            else
                return -1;
            }
        };

        List<Integer> l=new ArrayList<>();
        l.add(43);
        l.add(31);
        l.add(72);
        l.add(29);
//For our logic based sorting, passed object of comparator also here
        Collections.sort(l,c);
        System.out.println(l);

    }
}

