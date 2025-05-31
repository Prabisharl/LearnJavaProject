package org11.example.collections.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
//consumer is interface passing as datatype of object into forEach
        Consumer<Integer> con =new Consumer<Integer>(){
            public void accept (Integer n){
                System.out.println(n);
            }
        };
        l.forEach(con);

        //or simplyfy by lamda.........

        l.forEach(n-> System.out.println(n));

    }
}
