package com.home.arraylisttest.sample1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by vitaliy on 27.01.15.
 */
public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(6);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println("itr.next() = " + itr.next());
        }

        System.out.println("======================");

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(6);
        
        Iterator<Integer> itr2 = ll.iterator();
        while (itr2.hasNext()) {
            System.out.println("itr2.next() = " + itr2.next());
        }
    }
}
