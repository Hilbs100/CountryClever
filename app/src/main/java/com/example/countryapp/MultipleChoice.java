package com.example.countryapp;

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
     /* This method creates all the choices for the Multiple Choice problem
      All if (type.equals("blah")) contain the same basic code in them, so look at the
      first if statement for notes */
     private void createChoices() {
         // instance variables
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
                 choiceA = "" + country.getLandMass();
                 correctChoice = "a";
             } else if (rand == 2) {
                 choiceB = "" + country.getLandMass();
                 correctChoice = "b";
             } else if (rand == 3) {
                 choiceC = "" + country.getLandMass();
                 correctChoice = "c";
             } else if (rand == 4) {
                 choiceD = "" + country.getLandMass();
                 correctChoice = "d";
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
                 correctChoice = "a";
             } else if (rand == 2) {
                 choiceB = "" + country.getPopulation();
                 correctChoice = "b";
             } else if (rand == 3) {
                 choiceC = "" + country.getPopulation();
                 correctChoice = "c";
             } else if (rand == 4) {
                 choiceD = "" + country.getPopulation();
                 correctChoice = "d";
             }
         }
         if (type.equals("capital")) {
             a = findOtherCountries(countryIndex, -1, -1, -1);
             choiceA = "" + (Country.getCountry(a).getCapital());
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
                 correctChoice = "a";
             } else if (rand == 2) {
                 choiceB = "" + country.getCapital();
                 correctChoice = "b";
             } else if (rand == 3) {
                 choiceC = "" + country.getCapital();
                 correctChoice = "c";
             } else if (rand == 4) {
                 choiceD = "" + country.getCapital();
                 correctChoice = "d";
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
                 correctChoice = "a";
             } else if (rand == 2) {
                 choiceB = "" + country.getLanguage();
                 correctChoice = "b";
             } else if (rand == 3) {
                 choiceC = "" + country.getLanguage();
                 correctChoice = "c";
             } else if (rand == 4) {
                 choiceD = "" + country.getLanguage();
                 correctChoice = "d";
             }
         }
     }
     //finds a country of which that value has not been used; refer to createChoices
     public int findOtherCountries(int main, int a, int b, int c) {
         int rand = (int)(Math.random() * Country.getCountryListSize());
         while (true) {
             if (rand != a && rand != b && rand != c && rand != main)
                 return rand;
         }
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
