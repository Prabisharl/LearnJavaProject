package org11.example.collections.sortMethods.logicsorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Type2String implements Comparable<Type2String>{
    String name;
    int age;
    public Type2String(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+age;
    }
    public int compareTo(Type2String s){
//        return name.compareTo(s.name);
        return name.length()-s.name.length();
    }
    public static void main(String[] args) {
        List<Type2String> s=new ArrayList<>();
        s.add(new Type2String("apple",2));
        s.add(new Type2String("banana",4));
        s.add(new Type2String("kiwi",1));
        s.add(new Type2String("orangeeee",3));
        s.add(new Type2String("grape",5));
        Collections.sort(s);
        System.out.println(s);
    }
}
