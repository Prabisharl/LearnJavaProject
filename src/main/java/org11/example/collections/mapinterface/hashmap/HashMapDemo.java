package org11.example.collections.mapinterface.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> obj=new HashMap<>();
        obj.put(1,"Ragin");
        obj.put(2,"Rithvik");
        obj.put(3,"Ronald");
        obj.put(4,"Rahael");
        obj.put(5,"Rohan");

        System.out.println(obj);

        //enhanced loop
        for(Map.Entry<Integer, String> ref:obj.entrySet()){
            System.out.println(ref.getValue());
            System.out.println(ref.getKey());
        }

    }
}
