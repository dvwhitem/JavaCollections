package com.home.hashmaptest.sample5;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by vitaliy on 07.03.15.
 */
public class HashMapStructure {

    public static void main(String[] args) {

        Country india = new Country("India", 1000);
        Country japan = new Country("Japan", 10000);
        Country colombia = new Country("Colombia", 2000);
        Country poland = new Country("Poland", 20000);

        HashMap<Country,String> countryCapitalMap = new HashMap<Country, String>();
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(colombia, "Bogota");
        countryCapitalMap.put(poland, "Warsaw");
        countryCapitalMap.put(india, "Delhi");

        System.out.println(countryCapitalMap);
        Iterator<Country> countryIterator = countryCapitalMap.keySet().iterator();

        while (countryIterator.hasNext()) {
            Country countryObj = countryIterator.next();
            String capital = countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName() + " --- " + capital);
        }

    }
}
