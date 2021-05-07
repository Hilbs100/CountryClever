package com.example.countryapp;

import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.lang.Math;

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
    private boolean used;
    private static ArrayList<Country> countryList = new ArrayList<Country>();
    private static ArrayList<Country> nonUsedCountries = new ArrayList<Country>();
    private static ArrayList<Country> usedCountries = new ArrayList<Country>();
    private int numCountries;


    // Constructor Method
    public Country(int landMass, String funFact1, String countryName, int population,
    String capital, String language) {
        this.landMass = landMass;
        this.funFact1 = funFact1;
        this.countryName = countryName;
        this.population = population;
        this.capital = capital;
        this.language = language;
        used = false;
        this.populate();
        countryList.add(this);
    }
    private Country(Country c) {
        this(c.landMass, c.funFact1, c.countryName, c.population, c.capital, c.language);
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
    public static Country getCountry(int index) { return countryList.get(index); }
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
    public int getNumCountries() {
        return numCountries;
    }
    private static void deleteAllNotUsed() {
        while (nonUsedCountries.size() > 0) {
            nonUsedCountries.remove(0);
        }
    }
    private static void deleteAllUsed() {
        while (usedCountries.size() > 0) {
            usedCountries.remove(0);
        }
    }
    public static void reset() {
        for (int i = 0; i < countryList.size(); i++) {
            if (!countryList.get(i).used)
                return;
        }
        for (int i = 0; i < countryList.size(); i++) {
            countryList.get(i).used = false;
        }
    }

    //get randCountry no repeats
    public Country randCountryNoRpts() {
        reset();
        deleteAllNotUsed();
        deleteAllUsed();
        for (int i = 0; i < countryList.size(); i++) {
            if (countryList.get(i).used) {
                usedCountries.add(countryList.get(i));
            }
            else
                nonUsedCountries.add(countryList.get(i));
        }
        int rand = (int)(Math.random() * nonUsedCountries.size());
        Country cod = nonUsedCountries.get(rand);
        cod.used = true;
        return cod;
    }


    // Return index position of country in list
    public static int indexOfCountry(Country country) {
        for (int i = 0; i < countryList.size(); i++) {
            if (country.equals(countryList.get(i)))
                return i;
        }
        return -1;
    }

    //returns index position of country in usedCountries
    public static int indexOfUsedCountry(Country c) {
        for (int i = 0; i < usedCountries.size(); i++) {
            if (c.equals(usedCountries.get(i)))
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
    //Sets the amount of countries in the Array list so that they can be found during reinitialization
    public void setNumCountries() {
        numCountries = getCountryListSize();
    }


    //populates the Multiple Choice Questions
    public void populate() {
        landMassMC = new MultipleChoice("landMass", 4, this);
        populationMC = new MultipleChoice("population", 4, this);
        capitalMC = new MultipleChoice("capital", 4, this);
        languageMC = new MultipleChoice("language", 4, this);
    }
    // This converts all of the objects into .ser files to be used later
    public static void saveAll() {
        String num;
        for (int i = 0; i < countryList.size(); i++) {
            countryList.get(i).setNumCountries();
            num = "" + i;
            try {
                FileOutputStream fos = new FileOutputStream("Country" + num + ".ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(countryList.get(i));
                oos.close();
                fos.close();
            }
            catch(IOException ioe) {
                Log.i("Exception Logger", String.valueOf(ioe));

            }
        }
    }
    //This gets the objects from the .ser files
    public static void reinstate() {
        Country c;
        Country country = null;
        int numOfCountries;
        try {
            FileInputStream fis = new FileInputStream("Country0.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            c = (Country)ois.readObject();
            country = new Country(c);
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        numOfCountries = country.numCountries;
        String num;
        for (int i = 1; i < numOfCountries; i++) {
            num = "" + i;
            try {
                FileInputStream fis = new FileInputStream("Country" + num + ".ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                c = (Country)ois.readObject();
                country = new Country(c);
                ois.close();
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

}
