package com.example.countryapp;

import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Country {
    //private instance variables
    private final int landMass;
    private final String funFact1;
    private final String countryName;
    private final int population;
    private final String capital;
    private final String language;
    private final String description;
    private final String continent;
    private MultipleChoice landMassMC;
    private MultipleChoice populationMC;
    private MultipleChoice capitalMC;
    private MultipleChoice languageMC;
    private static int cYear;
    private static int cMonth;
    private static int cDay;
    private boolean used;
    public static Country countryOfTheDay;
    private static final ArrayList<Country> countryList = new ArrayList<>();
    private static final ArrayList<Country> nonUsedCountries = new ArrayList<>();
    private static final ArrayList<Country> usedCountries = new ArrayList<>();
    private int numCountries;


    // Constructor Method
    public Country(int landMass, String funFact1, String countryName, int population,
    String capital, String language, String description, String continent) {
        this.landMass = landMass;
        this.funFact1 = funFact1;
        this.countryName = countryName;
        this.population = population;
        this.capital = capital;
        this.language = language;
        this.description = description;
        this.used = false;
        this.continent = continent;
        countryList.add(this);
    }
    public Country(Country c) {
        this.landMass = c.landMass;
        this.funFact1 = c.funFact1;
        this.countryName = c.countryName;
        this.population = c.population;
        this.capital = c.capital;
        this.language = c.language;
        this.description = c.description;
        this.continent = c.continent;
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
    public String getContinent() {return continent;}
    public static int getCountryListSize() {
        return countryList.size();
    }
    //Accesses array list; returns a Country with null values instead of null
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
    public static Country getCountryOfTheDay()  {return countryOfTheDay; }
    public int getNumCountries() {
        return numCountries;
    }
    //so that it doesn't create a crash if called
    public static Country getCountry(int index) {
        if (index >= 0 && index < countryList.size())
            return countryList.get(index);
        else
            return new Country(0, "none", "none", 0,
                    "none", "none", "none");
    }

    // Methods for editing the array lists
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
    public static void setUsed() {
        for (int i = 0; i < countryList.size(); i++) {
            if (countryList.get(i).used) {
                usedCountries.add(countryList.get(i));
            }
            else
                nonUsedCountries.add(countryList.get(i));
        }
    }
    public static void setDate(int year, int month, int day) {
        cYear = year;
        cMonth = month;
        cDay = day;
    }

    //get randCountry no repeats
    public static Country setCountryOfTheDay() {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayCode = cYear * 365 + (cYear/4);
        for (int m = 1; m <= cMonth; m++) {
            dayCode += months[m];
        }
        dayCode += cDay;
        Log.i("Country", "" + dayCode + " modular: " + dayCode % countryList.size());
        Log.i("Country", "" + countryList.size());
        Country cod = Country.getCountry(dayCode % countryList.size());
        countryOfTheDay = new Country(cod);
        return cod;
    }
    // This will set the Countries of the day; s means start, e means end
    public static void setCountriesOfTheDay(int sYear, int eYear) {
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int rand;
        reset();
        deleteAllNotUsed();
        deleteAllUsed();
        setUsed();
        for (int y = sYear; y <= eYear; y++) {
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0)
                        months[2] = 29;
                    else
                        months [2] = 28;
                }
                else
                    months[2] = 29;
            }

            else
                months[2] = 28;
            for (int m = 1; m <= 12; m++) {
                for (int d = 1; d <= months[m]; d++) {
                    if (nonUsedCountries.size() > 0) {
                        rand = (int) (Math.random() * nonUsedCountries.size());
                        nonUsedCountries.get(rand).used = true;
                        usedCountries.add(nonUsedCountries.get(rand));
                        CountriesOfTheDay cod = new CountriesOfTheDay(nonUsedCountries.remove(rand), y, m, d);
                    }
                    else {
                        reset();
                        deleteAllNotUsed();
                        deleteAllUsed();
                        setUsed();
                        rand = (int) (Math.random() * nonUsedCountries.size());
                        nonUsedCountries.get(rand).used = true;
                        usedCountries.add(nonUsedCountries.get(rand));
                        CountriesOfTheDay cod = new CountriesOfTheDay(nonUsedCountries.remove(rand), y, m, d);
                    }


                }
            }
        }

    }

    public String getCodHeader() {
        return getCountryOfTheDay().getCountryName();
    }

    public String getCodBody() {
        //original that is being commented out for testing
        //Country countryOfDay = Country.getCountryOfTheDay();
        String body = "";
        body += "Capital: ";
        body += getCapital();
        body += "\nPopulation: ";
        body += this.getPopulation();
        body += "\nLandmass: ";
        body += this.getLandMass();
        body += " square miles\nLanguage: ";
        body += this.getLanguage();
        body += "\nFun Fact: ";
        body += this.getFunFact1();
        body += "\n Description: ";
        body += this.description;
        return body;
    }

    public static int findCountry(String fName) {
        for (int i = 0; i < countryList.size(); i++) {
            if (countryList.get(i).getCountryName().equalsIgnoreCase(fName) )
                return i;
        }
        return 0;
    }


    // Return index position of country in list
    public static int indexOfCountry(Country country) {
        for (int i = 0; i < countryList.size(); i++) {
            if (country.equals(countryList.get(i)))
                return i;
        }
        return 0;
    }

    //returns index position of country in usedCountries
    public static int indexOfUsedCountry(Country c) {
        for (int i = 0; i < usedCountries.size(); i++) {
            if (c.equals(usedCountries.get(i)))
                return i;
        }
        return 0;
    }

    // returns true if the two Country objects are the same, false otherwise
    public boolean equals(Country other) {
        return this.countryName.equals(other.getCountryName()) && this.capital.equals(other.getCapital());
    }
    //Sets the amount of countries in the Array list so that they can be found during reinitialization
    public void setNumCountries() {
        numCountries = getCountryListSize();
    }


    //populates the Multiple Choice Questions
    public static void populateAll() {
        for (int i = 0; i < countryList.size(); i++) {
            getCountry(i).populate();
        }
    }
    public void populate() {
        landMassMC = new MultipleChoice("landMass", 4, this);
        populationMC = new MultipleChoice("population", 4, this);
        capitalMC = new MultipleChoice("capital", 4, this);
        languageMC = new MultipleChoice("language", 4, this);
    }
    public String mcIntoString() {
        String out = "Capital: \nChoice A: " + this.getCapitalMC().getChoiceA();
        out += "\nChoice B: " +  this.getCapitalMC().getChoiceB();
        out += "\nChoice C: " + this.getCapitalMC().getChoiceC();
        out += "\nChoice D: " + this.getCapitalMC().getChoiceD();
        out += "\nPopulation: \nChoice A: " + this.getPopulationMC().getChoiceA();
        out += "\nChoice B: " +  this.getPopulationMC().getChoiceB();
        out += "\nChoice C: " + this.getPopulationMC().getChoiceC();
        out += "\nChoice D: " + this.getPopulationMC().getChoiceD();
        out += "\nLand Mass: \nChoice A: " + this.getLandMassMC().getChoiceA();
        out += "\nChoice B: " +  this.getLandMassMC().getChoiceB();
        out += "\nChoice C: " + this.getLandMassMC().getChoiceC();
        out += "\nChoice D: " + this.getLandMassMC().getChoiceD();
        out += "\nLanguage: \nChoice A: " + this.getLanguageMC().getChoiceA();
        out += "\nChoice B: " +  this.getLanguageMC().getChoiceB();
        out += "\nChoice C: " + this.getLanguageMC().getChoiceC();
        out += "\nChoice D: " + this.getLanguageMC().getChoiceD();
        return out;
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
