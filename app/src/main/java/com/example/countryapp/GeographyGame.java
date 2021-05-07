package com.example.countryapp;

import java.util.ArrayList;

public class GeographyGame {
    private ArrayList<String> countries;
    public GeographyGame() {
        countries = new ArrayList<String>();
    }
    public void addCountry(String name) {
        countries.add(name);
    }

}
