package com.home.arraylisttest.sample1;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by vitaliy on 26.01.15.
 */
public class ArrayListCompareLinkedList {
    public static void main(String[] args) {
        final int count = 100000;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for(int i = 0; i < count; i++) {
            arrayList.add(new Object());
        }

        ListIterator iterator;
        long start;
        
        iterator = arrayList.listIterator();
        start = System.currentTimeMillis();
        for(int i = 0; i < count; i++) {
            iterator.add(new Object());
        }

        System.out.println("ArrayList add  " +
                (System.currentTimeMillis() - start) + " ms");
    }
}
