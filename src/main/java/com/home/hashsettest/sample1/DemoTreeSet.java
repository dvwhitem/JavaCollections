package com.home.hashsettest.sample1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by vitaliy on 22.02.15.
 */
public class DemoTreeSet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        boolean b;
        for(int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 10) + "");
        }
        System.out.println(list + " list");
        TreeSet<String> set = new TreeSet<String>(list);
        System.out.println(set + " set");
        System.out.println(set.comparator());

        System.out.println(set.last() + " " + set.first());

        HashSet<String> hSet = new HashSet<String>(set);
        for (String str : hSet) {
            System.out.println(str + " " + str.hashCode());
        }
    }
}
