package com.home.hashmaptest.sample6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliy on 18.03.15.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Argentina");
        map.put(10, "Czech Republic");
        map.put(20, "Albania");
        map.put(30, "Brazil");
        map.put(40, "Italy");
        map.put(50, "Portugal");
        map.put(60, "Spain");
        map.put(70, "Ukraine");
        map.put(80, "Uruguay");
        map.put(90, "Germany");
        map.put(100, "France");
        map.put(110, "Columbia");
        map.put(120, "Finland");
        map.put(130, "Norway");
        map.put(140, "Denmark");
        map.put(150, "Croatia");
        map.put(160, "India");
        map.put(170, "China");

        System.out.println(map);
    }
}
