package com.home.hashsettest.sample1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by vitaliy on 22.02.15.
 */
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<String>(100);
        long callTime = System.nanoTime();
        Scanner scan = null;
        try {
            scan = new Scanner(
                    new File("src/main/resources/test.txt"));
            scan.useDelimiter("[^А-я]+");
            while (scan.hasNext()) {
                String word = scan.next();
                words.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        TreeSet<String> ts = new TreeSet<String>(words);
        System.out.println(ts);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("different words: " + words.size() +
                ", " + totalTime + " nanoseconds");
    }
}
