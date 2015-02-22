package com.home.hashsettest.sample1;

import java.util.EnumSet;

/**
 * Created by vitaliy on 22.02.15.
 */
public class DemoEnumSet {
    public static void main(String[] args) {
        EnumSet<CarManufacturer> japanAuto =
                EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.LEXUS);
        EnumSet<CarManufacturer> other = EnumSet.complementOf(japanAuto);

        System.out.println(japanAuto);
        System.out.println(other);
        action("audi", japanAuto);
        action("suzuki", japanAuto);
    }

    public static boolean action(String auto, EnumSet<CarManufacturer> set) {
        CarManufacturer cm = CarManufacturer.valueOf(auto.toUpperCase());
        boolean ok;
        if(ok = set.contains(cm)) {
            System.out.println("Processing: " + cm);
        } else {
            System.out.println("Processing isn't possible: " + cm);
        }
        return ok;
    }
}
