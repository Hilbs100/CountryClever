package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizGrade extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_results);

        TextView lMFeedback = (TextView) findViewById(R.id.LandMassAnswer);
        TextView popFeedback = (TextView) findViewById(R.id.PopulationAnswer);
        TextView capFeedback = (TextView) findViewById(R.id.CapitalAnswer);
        TextView langFeedback = (TextView) findViewById(R.id.LanguageAnswer);
        TextView contFeedback = (TextView) findViewById(R.id.ContinentAnswer);

        TextView score = (TextView) findViewById(R.id.grade);
        score.setText("" + MultipleChoice.score() + "%");
        if (MultipleChoice.score() == 100.0)
            score.setTextColor(Color.GREEN);
        else if(MultipleChoice.score() == 0.0) {
            score.setTextColor(Color.RED);
        }
        else
            score.setTextColor(Color.YELLOW);
        Country cod = Country.getCountryOfTheDay();
        if(!cod.getLandMassMC().getWasCorrect()) {
            lMFeedback.setText("The land mass of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getLandMassMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getLandMassMC().getCorrectChoice());
        }
        if(!cod.getPopulationMC().getWasCorrect()) {
            popFeedback.setText("The population of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getPopulationMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getPopulationMC().getCorrectChoice());
        }
        if(!cod.getContinentMC().getWasCorrect()) {
            contFeedback.setText("The continent that " + cod.getCountryName() + " is: \nYour Answer: " + cod.getContinentMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getContinentMC().getCorrectChoice());
        }
        if(!cod.getLanguageMC().getWasCorrect()) {
            langFeedback.setText("The main language of" + cod.getCountryName() + " is: \nYour Answer: " + cod.getLanguageMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getLanguageMC().getCorrectChoice());
        }
        if(!cod.getCapitalMC().getWasCorrect()) {
            capFeedback.setText("The capital of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getCapitalMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getCapitalMC().getCorrectChoice());
        }

        TextView descrip = (TextView) findViewById(R.id.description);
        String description = cod.getDescription();
        String name = cod.getCountryName();
        int landma = cod.getLandMass();
        int population = cod.getPopulation();
        String lang = cod.getLanguage();
        String capital = cod.getCapital();
        String continent = cod.getContinent();
        String funFacts = cod.getFunFact1();
        descrip.setText("\n" + name + "\n" + description + "\nLandmass: " + landma + "\nPopulation: " + population + "\nLanguage: " + lang + "\nCapital: " + capital + "\nContinent: " + continent + "\nDid you know?\n" + funFacts);



    }
    public void goHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

