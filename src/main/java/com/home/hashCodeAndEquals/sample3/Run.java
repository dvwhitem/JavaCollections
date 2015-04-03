package com.home.hashCodeAndEquals.sample3;

/**
 * Created by vitaliy on 03.04.15.
 */
public class Run {

    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new A();

        o1.setA(1);
        o1.setB(2);

        o2.setA(1);
        o2.setB(2);

        System.out.println(o1.hashCode() == o2.hashCode());

        o2.setA(2);
        o2.setB(1);

        System.out.println(o1.hashCode() == o2.hashCode());

        System.out.println(o1.hashCode() == o1.hashCode());
        
        o2.setA(25);
        o2.setB(100);


        System.out.println("o1 = " + o1.hashCode() + " o2 = " + o2.hashCode());

        o1.setA(1);
        o2.setB(2);

        o2.setA(1);
        o2.setA(2);

        System.out.println(o1.equals(o2));

    }
}
