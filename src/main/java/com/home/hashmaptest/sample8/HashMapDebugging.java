package com.home.hashmaptest.sample8;

import java.util.HashMap;

/**
 * Created by vitaliy on 19.03.15.
 */
public class HashMapDebugging {
    public static void main(String[] args) {

//        int h;
//        Object key = "test";
//
//        System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
//        System.out.println((h = key.hashCode()) ^ (h >>> 16));

        //(p = tab[i = (n - 1) & hash]) == null

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(null, "test");
        hashMap.put("0", "test");
        System.out.println(hashMap);
    }
}
