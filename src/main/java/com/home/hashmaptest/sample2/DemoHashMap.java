package com.home.hashmaptest.sample2;

import java.util.*;

/**
 * Created by vitaliy on 02.03.15.
 */
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>(3);
        hm.put("key1", 3);
        hm.put("key2", 5);
        hm.put("key3", 1);
        hm.put("key4", 1);

        System.out.println(hm);
        hm.put("key2", 4);
        System.out.println(hm + " after replace");
        Integer a = hm.get("key4");
        System.out.println("search for key 'key4' " + a);
        Set<Map.Entry<String,Integer>> entry = hm.entrySet();
        System.out.println(entry);
        Iterator<Map.Entry<String,Integer>> i = entry.iterator();
        while (i.hasNext()) {
            Map.Entry<String,Integer> me = i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        Set<Integer> val = new HashSet<Integer>(hm.values());
        System.out.println(val);
    }
}
