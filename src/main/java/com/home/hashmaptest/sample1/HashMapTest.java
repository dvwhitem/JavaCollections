package com.home.hashmaptest.sample1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliy on 28.02.15.
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("0", "zero");

        int h;
        Object key = "0";
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }
}
