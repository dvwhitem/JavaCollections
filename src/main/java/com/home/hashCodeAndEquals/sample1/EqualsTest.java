package com.home.hashCodeAndEquals.sample1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by go1095 on 3/2/15.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        System.out.println(e1.equals(e2));

        Set employees = new HashSet();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);

    }
}
