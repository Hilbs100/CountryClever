package com.example.countryapp;

import android.util.Log;

public class MultipleChoice {
    // type indicates which "type" of question; i.e. capital, population, language, etc.
    private String type;
    // Let's have in between 2 and four
    private int numAnswers;
    private Country country;
    private int countryIndex;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String correctChoice;
    private static double score;
    //Constructor
    public MultipleChoice(String type, int numAnswers, Country country) {
        this.type = type;
        if (numAnswers > 4) {
            this.numAnswers = 4;
        }
        else if (numAnswers < 2)
            this.numAnswers = 2;
        else
            this.numAnswers = numAnswers;
        this.country = country;
        countryIndex = Country.indexOfCountry(country);
        createChoices();
    }
    public void submitAnswer(String choice) {
        Log.i("MC", "Answer submitted");
        if (choice.equals(correctChoice)) {
            score++;
            Log.i("MC", "Answer was correct");
        }
        else
            Log.i("MC", "Answer was incorrect");

    }
    public static void reset() {
        score = 0;
    }
    public static double score() {
        Log.i("MC", "" + 100 * (score/4.0));
        return 100 * (score/4.0);
    }
    /* This method creates all the choices for the Multiple Choice problem
     All if (type.equals("blah")) contain the same basic code in them, so look at the
     first if statement for notes */
    private void createChoices() {
        // instance variables
        choiceA = "";
        choiceB = "";
        choiceC = "";
        choiceD = "";
        int rand;
        int a;
        int b;
        int c;
        int d;
        if (type.equals("landMass")) {
            // Uses the findOtherCountries class to find a country which hasn't been used yet
            a = findOtherCountries(countryIndex, -1, -1, -1);
            //Converts all choices into String form for easy usage as text later
            choiceA = "" + (Country.getCountry(a).getLandMass());
            b = findOtherCountries(countryIndex, a, -1, -1);
            choiceB = "" + (Country.getCountry(b).getLandMass());
            if (numAnswers >= 3) {
                c = findOtherCountries(countryIndex, a, b, -1);
                choiceC = "" + (Country.getCountry(c).getLandMass());
                if (numAnswers == 4) {
                    d = findOtherCountries(countryIndex, a, b, c);
                    choiceD = "" + (Country.getCountry(d).getLandMass());
                }
            }
            // This puts the choice in there as it wasn't in there before, replacing one of the
            // ones so that the correct answer choice is there; make sure that the correctChoice is
            // lowercase if you decide to change something
            rand = (int) ((Math.random() * numAnswers) + 1);
            if (rand == 1) {
                choiceA = "" + country.getLandMass() ;
                correctChoice = choiceA + " square miles";
            } else if (rand == 2) {
                choiceB = "" + country.getLandMass() ;
                correctChoice = choiceB + " square miles";
            } else if (rand == 3) {
                choiceC = "" + country.getLandMass();
                correctChoice = choiceC + " square miles";
            } else if (rand == 4) {
                choiceD = "" + country.getLandMass();
                correctChoice = choiceD + " square miles";
            }
        }
        if (type.equals("population")) {
            a = findOtherCountries(countryIndex, -1, -1, -1);
            choiceA = "" + (Country.getCountry(a).getPopulation());
            b = findOtherCountries(countryIndex, a, -1, -1);
            choiceB = "" + (Country.getCountry(b).getPopulation());
            if (numAnswers >= 3) {
                c = findOtherCountries(countryIndex, a, b, -1);
                choiceC = "" + (Country.getCountry(c).getPopulation());
                if (numAnswers == 4) {
                    d = findOtherCountries(countryIndex, a, b, c);
                    choiceD = "" + (Country.getCountry(d).getPopulation());
                }
            }
            rand = (int)((Math.random() * numAnswers) + 1);
            if (rand == 1) {
                choiceA = "" + country.getPopulation();
                correctChoice = choiceA + "people";
            } else if (rand == 2) {
                choiceB = "" + country.getPopulation();
                correctChoice = choiceB + "people";
            } else if (rand == 3) {
                choiceC = "" + country.getPopulation();
                correctChoice = choiceC + "people";
            } else if (rand == 4) {
                choiceD = "" + country.getPopulation();
                correctChoice = choiceD + "people";
            }
        }
        if (type.equals("capital")) {
            a = findOtherCountries(countryIndex, -1, -1, -1);
            choiceA = "" + Country.getCountry(a).getCapital();
            b = findOtherCountries(countryIndex, a, -1, -1);
            choiceB = "" + (Country.getCountry(b).getCapital());
            if (numAnswers >= 3) {
                c = findOtherCountries(countryIndex, a, b, -1);
                choiceC = "" + (Country.getCountry(c).getCapital());
                if (numAnswers == 4) {
                    d = findOtherCountries(countryIndex, a, b, c);
                    choiceD = "" + (Country.getCountry(d).getCapital());
                }
            }
            rand = (int)((Math.random() * numAnswers) + 1);
            if (rand == 1) {
                choiceA = "" + country.getCapital();
                correctChoice = choiceA;
            } else if (rand == 2) {
                choiceB = "" + country.getCapital();
                correctChoice = choiceB;
            } else if (rand == 3) {
                choiceC = "" + country.getCapital();
                correctChoice = choiceC;
            } else if (rand == 4) {
                choiceD = "" + country.getCapital();
                correctChoice = choiceD;
            }
        }
        if (type.equals("language")) {
            a = findOtherCountries(countryIndex, -1, -1, -1);
            choiceA = "" + (Country.getCountry(a).getLanguage());
            b = findOtherCountries(countryIndex, a, -1, -1);
            choiceB = "" + (Country.getCountry(b).getLanguage());
            if (numAnswers >= 3) {
                c = findOtherCountries(countryIndex, a, b, -1);
                choiceC = "" + (Country.getCountry(c).getLanguage());
                if (numAnswers >= 4) {
                    d = findOtherCountries(countryIndex, a, b, c);
                    choiceD = "" + (Country.getCountry(d).getLanguage());
                }
            }
            rand = (int)((Math.random() * numAnswers) + 1);
            if (rand == 1) {
                choiceA = "" + country.getLanguage();
                correctChoice = choiceA;
            } else if (rand == 2) {
                choiceB = "" + country.getLanguage();
                correctChoice = choiceB;
            } else if (rand == 3) {
                choiceC = "" + country.getLanguage();
                correctChoice = choiceC;
            } else if (rand == 4) {
                choiceD = "" + country.getLanguage();
                correctChoice = choiceD;
            }
        }
    }
    //finds a country of which that value has not been used; refer to createChoices
    public int findOtherCountries(int main, int a, int b, int c) {
        boolean run = true;
        int rand = (int)(Math.random() * (Country.getCountryListSize()-1)) + 1;
        while (run) {
            if (rand != a && rand != b && rand != c && rand != main) {
                if (type.equals("landMass") && country.getLandMass() != Country.getCountry(rand).getLandMass()
                        && !(choiceA.equals("" + Country.getCountry(rand).getLandMass())) &&
                        !(choiceB.equals("" + Country.getCountry(rand).getLandMass())) &&
                        !(choiceC.equals("" + Country.getCountry(rand).getLandMass())) &&
                        !(choiceD.equals("" + Country.getCountry(rand).getLandMass()))) {
                    return rand;
                }
                else if (type.equals("population") && country.getPopulation() != Country.getCountry(rand).getPopulation()
                        && !(choiceA.equals("" + Country.getCountry(rand).getPopulation())) &&
                        !(choiceB.equals("" + Country.getCountry(rand).getPopulation())) &&
                        !(choiceC.equals("" + Country.getCountry(rand).getPopulation())) &&
                        !(choiceD.equals("" + Country.getCountry(rand).getPopulation())))
                    return rand;
                else if (type.equals("capital") && !(country.getCapital().equals(Country.getCountry(rand).getCapital()))
                        && !(choiceA.equals("" + Country.getCountry(rand).getCapital())) &&
                        !(choiceB.equals("" + Country.getCountry(rand).getCapital())) &&
                        !(choiceC.equals("" + Country.getCountry(rand).getCapital())) &&
                        !(choiceD.equals("" + Country.getCountry(rand).getCapital())))
                    return rand;
                else if(type.equals("language") && !(country.getLanguage().equals(Country.getCountry(rand).getLanguage()))
                        && !(choiceA.equals("" + Country.getCountry(rand).getLanguage())) &&
                        !(choiceB.equals("" + Country.getCountry(rand).getLanguage())) &&
                        !(choiceC.equals("" + Country.getCountry(rand).getLanguage())) &&
                        !(choiceD.equals("" + Country.getCountry(rand).getLanguage())))
                    return rand;
            }
            rand = (int)(Math.random() * (Country.getCountryListSize() - 1)) + 1;
        }
        return 0;
    }
    //Accessor Methods
    public String getChoiceA() {
        return choiceA;
    }
    public String getChoiceB() {
        return choiceB;
    }
    public String getChoiceC() {
        return choiceC;
    }
    public String getChoiceD() {
        return choiceD;
    }
    public String getCorrectChoice() {
        return correctChoice;
    }

}