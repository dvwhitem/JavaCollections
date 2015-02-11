package com.home.arraylisttest.sample1;

import java.util.ArrayList;

/**
 * Created by vitaliy on 19.01.15.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(3, 51);
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }
}
