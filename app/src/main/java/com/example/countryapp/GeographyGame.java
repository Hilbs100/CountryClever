package com.example.countryapp;

import android.util.Log;

import java.util.ArrayList;

public class GeographyGame {
    private static ArrayList<GeographyGame> maps = new ArrayList<GeographyGame>();
    private ArrayList<String> countries = new ArrayList<String>();
    private ArrayList<String> usedCountries = new ArrayList<String>();
    private ArrayList<String> unusedCountries = new ArrayList<String>();
    private int score = 0;
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
    public void start() {
        findNewCountry();
    }
    private void findNewCountry() {
        int rand = (int)(Math.random() * unusedCountries.size());
        if (unusedCountries.size() > 0) {
            goalCountry = unusedCountries.get(rand);
            usedCountries.add(unusedCountries.remove(rand));
        }
        else {
            goalCountry = "Nothing, you're Finished!";
        }
        Log.i("Country Selected", goalCountry);
    }
    public String getGoalCountry() {
        return goalCountry;
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
    public void reset() {
        while(usedCountries.size() > 0) {
            usedCountries.remove(0);
        }
        while(unusedCountries.size() > 0) {
            unusedCountries.remove(0);
        }
        for (int i = 0; i < countries.size(); i++) {
            unusedCountries.add(countries.get(i));
        }
        score = 0;

    }
    public double returnScore() {
        return ((score + 0.0)/(countries.size())) * 100;
    }

    public static void addMap(GeographyGame map) {
        maps.add(map);
    }
    public static GeographyGame getMap(int i ) {
        return maps.get(i);
    }


}
