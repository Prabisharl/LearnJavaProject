package org11.example.collections.mapinterface.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {
    public static void main(String[] args)
    {
        Map<String, Integer> tm = new TreeMap<>();

        // Adding elements to the tree map
        tm.put("A", 1);
        tm.put("C", 3);
        tm.put("B", 2);

        // Getting values from the tree map
        int ans = tm.get("A");
        System.out.println("Value of A: " + ans);

        // Removing elements from the tree map
        tm.remove("B");

        // Iterating over the elements of the tree map
        for (String key : tm.keySet()) {
            System.out.println("Key: " + key + ", Value: "
                    + tm.get(key));
        }
    }
}
