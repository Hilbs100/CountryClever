package com.example.countryapp;

import java.util.*;


public class Country {
    //private instance variables
    private int landMass;
    private String funFact1;
    private String countryName;
    private int population;
    private String capital;
    private String language;
    private MultipleChoice landMassMC;
    private MultipleChoice populationMC;
    private MultipleChoice capitalMC;
    private MultipleChoice languageMC;
    private static ArrayList<Country> countryList = new ArrayList<Country>();


    // Constructor Method
    public Country(int landMass, String funFact1, String countryName, int population,
    String capital, String language) {
        this.landMass = landMass;
        this.funFact1 = funFact1;
        this.countryName = countryName;
        this.population = population;
        this.capital = capital;
        this.language = language;
        this.populate();
        countryList.add(this);
    }

    // Accessor Methods
    public int getLandMass() {
        return landMass;
    }
    public String getFunFact1() {
        return funFact1;
    }
    public int getPopulation() {
        return population;
    }
    public String getCountryName() {
        return countryName;
    }
    public String getCapital() {
        return capital;
    }
    public String getLanguage() {
        return language;
    }
    public static int getCountryListSize() {
        return countryList.size();
    }
    public static Country getCountry(int index) {
        return countryList.get(index);
    }
    public MultipleChoice getLandMassMC() {
        return landMassMC;
    }
    public MultipleChoice getPopulationMC() {
        return populationMC;
    }
    public MultipleChoice getCapitalMC() {
        return capitalMC;
    }
    public MultipleChoice getLanguageMC() {
        return languageMC;
    }


    // Return index position of country in list
    public static int indexOfCountry(Country country) {
        for (int i = 0; i < countryList.size(); i++) {
            if (country.equals(countryList.get(i)))
                return i;
        }
        return -1;
    }


    // returns true if the two Country objects are the same, false otherwise
    public boolean equals(Country other) {
        if (this.countryName.equals(other.getCountryName()) && this.capital.equals(other.getCapital()))
            return true;
        else
            return false;
    }


    //populates the Multiple Choice Questions
    public void populate() {
        landMassMC = new MultipleChoice("landMass", 4, this);
        populationMC = new MultipleChoice("population", 4, this);
        capitalMC = new MultipleChoice("capital", 4, this);
        languageMC = new MultipleChoice("language", 4, this);
    }
}
