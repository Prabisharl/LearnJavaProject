package org11.example.collections.sortMethods.logicsorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyNumber implements Comparable<MyNumber>{
    int value;
    MyNumber(int value){
        this.value=value;
    }
    public String toString(){
        return "Value: "+value;
    }
    public int compareTo(MyNumber that){
        return this.value%10 - that.value%10;//ascending order
        //return that.value%10 - this.value%10;//descending order
//        return Integer.compare(this.value%10,that.value%10);//ascending order
//        return Integer.compare(that.value%10,this.value%10);//descending order
    }
}
public class Type1Integer {
    public static void main(String[] args) {
        List<MyNumber> l=new ArrayList<>();
        l.add(new MyNumber(54));
        l.add(new MyNumber(21));
        l.add(new MyNumber(45));
        l.add(new MyNumber(12));
        l.add(new MyNumber(56));

        Collections.sort(l);
        System.out.println(l);

    }
}
