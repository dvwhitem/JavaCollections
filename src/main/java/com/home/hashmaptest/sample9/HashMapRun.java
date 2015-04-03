package com.home.hashmaptest.sample9;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by vitaliy on 19.03.15.
 */
public class HashMapRun {
    public static void main(String[] args) {
        Cars bmw = new Cars(1, "BMW");
        Cars mercedes = new Cars(2, "Mercedes");
        Cars ferrari = new Cars(3, "Ferrari");
        Cars maserati = new Cars(4, "Maserati");
        Cars bugatti = new Cars(5, "Bugatti");
        Cars honda = new Cars(6, "Honda");
        Cars skoda = new Cars(7, "Skoda");
        Cars toyota = new Cars(8, "Toyota");
        Cars ford = new Cars(9, "Ford");
        Cars kia  = new Cars(10, "KIA");

        HashMap<Cars, String> carsHashMap = new HashMap<Cars, String>();
        carsHashMap.put(bmw, "Germany");
        carsHashMap.put(mercedes, "Germany");
        carsHashMap.put(ferrari, "Italy");
        carsHashMap.put(maserati, "Italy");
        carsHashMap.put(bugatti, "France");
        carsHashMap.put(honda, "Japan");
        carsHashMap.put(skoda, "Czech Republic");
        carsHashMap.put(toyota, "Japan");
        carsHashMap.put(ford, "USA");
        carsHashMap.put(kia, "South Korea");

        System.out.println(carsHashMap);
        System.out.println(bmw.hashCode());

        Iterator<Cars> iterator = carsHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Cars cars = iterator.next();
            String country = carsHashMap.get(cars);
            System.out.println("ID: " + cars.getId() + " BRAND: " + cars.getBrand() +
                    "(" + country +  ")" + " HASH = " + cars.hashCode());
        }
    }
}
