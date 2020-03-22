package com.infix.java.hashmap;

import java.util.HashMap;

public class MyJavaHwHashmap {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("bangladesh", "dhaka");
        capitalCities.put("india", "mumbai");
        capitalCities.put("canada", "toronto");
        System.out.println(capitalCities);
    }
}