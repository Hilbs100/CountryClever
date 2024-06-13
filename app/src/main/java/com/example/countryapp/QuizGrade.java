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
                    + "\nCorrect Answer: " + cod.getLandMassMC().getCorrectChoice() + "\n");
        }
        else
            lMFeedback.setVisibility(View.GONE);
        if(!cod.getPopulationMC().getWasCorrect()) {
            popFeedback.setText("The population of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getPopulationMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getPopulationMC().getCorrectChoice() + "\n");
        }
        else
            popFeedback.setVisibility(View.GONE);
        if(!cod.getContinentMC().getWasCorrect()) {
            contFeedback.setText("The continent that " + cod.getCountryName() + " is: \nYour Answer: " + cod.getContinentMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getContinentMC().getCorrectChoice() + "\n");
        }
        else
            contFeedback.setVisibility(View.GONE);
        if(!cod.getLanguageMC().getWasCorrect()) {
            langFeedback.setText("The main language of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getLanguageMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getLanguageMC().getCorrectChoice() + "\n");
        }
        else
            langFeedback.setVisibility(View.GONE);
        if(!cod.getCapitalMC().getWasCorrect()) {
            capFeedback.setText("The capital of " + cod.getCountryName() + " is: \nYour Answer: " + cod.getCapitalMC().getChosenAnswer()
                    + "\nCorrect Answer: " + cod.getCapitalMC().getCorrectChoice() + "\n");
        }
        else
            capFeedback.setVisibility(View.GONE);

        TextView descrip = (TextView) findViewById(R.id.description);
        String description = cod.getDescription();
        String funFacts = cod.getFunFact1();
        descrip.setText( description + "\n\nDid you know?\n" + funFacts + "\n");



    }
    public void goHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

