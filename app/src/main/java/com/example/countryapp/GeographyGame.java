package com.example.countryapp;

import android.util.Log;

import java.util.ArrayList;

public class GeographyGame {
    private static ArrayList<GeographyGame> maps = new ArrayList<GeographyGame>();
    private ArrayList<String> countries = new ArrayList<String>();
    private ArrayList<String> usedCountries = new ArrayList<String>();
    private ArrayList<String> unusedCountries = new ArrayList<String>();
    private String goalCountry;
    public GeographyGame() {
        countries = new ArrayList<String>();
    }
    public void addCountry(String name) {
        countries.add(name);
    }
    public void setUnusedCountries() {
        for (int i = 0; i < countries.size(); i++) {
            unusedCountries.add(countries.get(i));
        }
    }
    public void findNewCountry() {
        int rand = (int)(Math.random() * unusedCountries.size());
        goalCountry = unusedCountries.get(rand);
        usedCountries.add(unusedCountries.remove(rand));
    }
    public boolean pick(String country) {
        if (country.equals(goalCountry)) {
            findNewCountry();
            Log.i("Geography Game", "true");
            return true;
        }
        findNewCountry();
        Log.i("Geography Game", "false");
        return false;

    }
    public static void addMap(GeographyGame map) {
        maps.add(map);
    }
    public static GeographyGame getMap(int i ) {
        return maps.get(i);
    }


}
