package org11.example.collections.sortMethods.logicsorting.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Type2String {
    public static void main(String[] args) {
        Comparator<String> s=new Comparator<>(){
            @Override
            public int compare(String s1, String s2){
               if(s1.length()>s2.length()) {
                    return 1;
                }else{
                   return -1;
                }
            }
        };
       List<String> list=new ArrayList<>();
         list.add("apple");
         list.add("banana");
         list.add("kiwi");
         list.add("orangeeee");
         list.add("grape");
        Collections.sort(list,s);
        System.out.println(list);
    }
}
