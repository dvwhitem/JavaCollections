package com.home.hashCodeAndEquals;

/**
 * Created by go1095 on 3/2/15.
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e1.setId(100);

        System.out.println(e1.equals(e2));
    }
}
