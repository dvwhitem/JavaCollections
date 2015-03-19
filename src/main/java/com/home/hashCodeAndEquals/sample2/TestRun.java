package com.home.hashCodeAndEquals.sample2;

import java.util.Arrays;

/**
 * Created by vitaliy on 18.03.15.
 */
public class TestRun {



    public static void main(String[] args) {
        Test test = new Test();
        Test2 test2 = new Test2();

        System.out.println("Equals: " + test.equals(test2));
        System.out.println("HashCode Test: " + test.hashCode());
        System.out.println("HashCode Test2: " + test2.hashCode());

        String str = "Hello World";
        String str2 = new String("Hello World");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));



    }
}
