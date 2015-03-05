package com.home.hashmaptest.sample3;

import java.util.HashMap;

/**
 * Created by vitaliy on 03.03.15.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(167, "Carlos");
        System.out.println(map.get(167));
    }
}
