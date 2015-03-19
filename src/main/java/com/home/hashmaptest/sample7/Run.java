package com.home.hashmaptest.sample7;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vitaliy on 18.03.15.
 */
public class Run {
    public static void main(String[] args) {
        Map<Test, Integer> map = new HashMap<Test, Integer>();
        Test test = new Test();
        test.setName("test1");

        map.put(test, 1);

        test.setName("test2");

        Test test2 = new Test();

        test2.setName("test2");

        System.out.println(map.get(test));
        System.out.println(map.get(test2));
    }
}
