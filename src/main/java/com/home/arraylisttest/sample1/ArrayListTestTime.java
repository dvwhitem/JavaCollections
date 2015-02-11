package com.home.arraylisttest.sample1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by vitaliy on 10.02.15.
 */
public class ArrayListTestTime {
    public static void main(String[] args) {
        // ArrayList add
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("ArrayList add: " + duration);

        // LinkedList add
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

         endTime = System.nanoTime();
         duration = endTime - startTime;

        System.out.println("LinkedList add: " + duration);
    }
}
