package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
//import the time thingy here



public class CountryOfDay extends AppCompatActivity {

    RadioGroup capitalMC;
    RadioGroup languageMC;
    RadioGroup populationMC;
    RadioGroup landMassMC;
    RadioGroup continentMC;
    RadioButton radioButton;
    Country cod;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("COD", "Opened");
        cod = Country.getCountryOfTheDay();
        Log.i("COD", cod.getCountryName());
        setContentView(R.layout.activity_country_of_day);
        TextView header = (TextView) findViewById(R.id.header);
        String headerText = cod.getCountryName();
        header.setText("" + headerText);
        Country.getCountryOfTheDay().populate();
        TextView descrip = (TextView) findViewById(R.id.description);
        String description = cod.getDescription();
        descrip.setText("" + description);


        capitalMC = (RadioGroup) findViewById(R.id.Capital);
        languageMC = (RadioGroup) findViewById(R.id.Language);
        landMassMC = (RadioGroup) findViewById(R.id.LandMass);
        populationMC = (RadioGroup) findViewById(R.id.Population);
        continentMC = (RadioGroup) findViewById(R.id.Continent);

        NumberFormat formatting = NumberFormat.getInstance();

        TextView capQues = (TextView) findViewById(R.id.capQues);
        capQues.setText("The capital of " + cod.getCountryName() + " is: ");
        RadioButton capA = (RadioButton)findViewById(R.id.capa);
        capA.setText("" + cod.getCapitalMC().getChoiceA());
        RadioButton capB = (RadioButton)findViewById(R.id.capb);
        capB.setText("" + cod.getCapitalMC().getChoiceB());
        RadioButton capC = (RadioButton)findViewById(R.id.capc);
        capC.setText("" + cod.getCapitalMC().getChoiceC());
        RadioButton capD = (RadioButton)findViewById(R.id.capd);
        capD.setText("" + cod.getCapitalMC().getChoiceD());

        TextView langQues = (TextView) findViewById(R.id.langQues);
        langQues.setText("The main language of " + cod.getCountryName() + " is: ");
        RadioButton langA = (RadioButton)findViewById(R.id.langA);
        langA.setText("" + cod.getLanguageMC().getChoiceA());
        RadioButton langB = (RadioButton)findViewById(R.id.langB);
        langB.setText("" + cod.getLanguageMC().getChoiceB());
        RadioButton langC = (RadioButton)findViewById(R.id.langC);
        langC.setText("" + cod.getLanguageMC().getChoiceC());
        RadioButton langD = (RadioButton)findViewById(R.id.langD);
        langD.setText("" + cod.getLanguageMC().getChoiceD());

        TextView contQues = (TextView) findViewById(R.id.contQues);
        contQues.setText("The continent that " + cod.getCountryName() + " is located in is: ");
        RadioButton contA = (RadioButton)findViewById(R.id.contA);
        contA.setText("" + cod.getContinentMC().getChoiceA());
        RadioButton contB = (RadioButton)findViewById(R.id.contB);
        contB.setText("" + cod.getContinentMC().getChoiceB());
        RadioButton contC = (RadioButton)findViewById(R.id.contC);
        contC.setText("" + cod.getContinentMC().getChoiceC());
        RadioButton contD = (RadioButton)findViewById(R.id.contD);
        contD.setText("" + cod.getContinentMC().getChoiceD());


        TextView landQues = (TextView) findViewById(R.id.LMQues);
        landQues.setText("The land mass of " + cod.getCountryName() + " is: ");
        RadioButton landA = (RadioButton)findViewById(R.id.LMa);
        landA.setText("" + cod.getLandMassMC().getChoiceA() + " square miles");
        RadioButton landB = (RadioButton)findViewById(R.id.LMb);
        landB.setText("" + cod.getLandMassMC().getChoiceB() + " square miles");
        RadioButton landC = (RadioButton)findViewById(R.id.LMc);
        landC.setText("" + cod.getLandMassMC().getChoiceC() + " square miles");
        RadioButton landD = (RadioButton)findViewById(R.id.LMd);
        landD.setText("" + cod.getLandMassMC().getChoiceD() + " square miles");

        TextView popQues = (TextView) findViewById(R.id.popQues);
        popQues.setText("The population of " + cod.getCountryName() + " is: ");
        RadioButton popA = (RadioButton)findViewById(R.id.popA);
        popA.setText("" + (cod.getPopulationMC().getChoiceA()) + " people");
        RadioButton popB = (RadioButton)findViewById(R.id.popB);
        popB.setText("" + (cod.getPopulationMC().getChoiceB()) + " people");
        RadioButton popC = (RadioButton)findViewById(R.id.popC);
        popC.setText("" + (cod.getPopulationMC().getChoiceC()) + " people");
        RadioButton popD = (RadioButton)findViewById(R.id.popD);
        popD.setText("" + (cod.getPopulationMC().getChoiceD()) + " people");



    }
    public void scoreTest(View v) {

        Intent intent = new Intent(this, QuizGrade.class);
        int capitalAnswer = capitalMC.getCheckedRadioButtonId();
        MultipleChoice.reset();
        if (capitalAnswer != -1) {
            Log.i("MC", "" + capitalAnswer);
            radioButton = findViewById(capitalAnswer);
            cod.getCapitalMC().submitAnswer("" + radioButton.getText());
        }

        int languageAnswer = languageMC.getCheckedRadioButtonId();
        if (languageAnswer != -1) {
            Log.i("MC", "" + languageAnswer);
            radioButton = findViewById(languageAnswer);
            cod.getLanguageMC().submitAnswer("" + radioButton.getText());
        }

        int continentAnswer = continentMC.getCheckedRadioButtonId();
        if (languageAnswer != -1) {
            Log.i("MC", "" + continentAnswer);
            radioButton = findViewById(continentAnswer);
            cod.getContinentMC().submitAnswer("" + radioButton.getText());
        }

        int landMassAnswer = landMassMC.getCheckedRadioButtonId();
        if (landMassAnswer != -1) {
            Log.i("MC", "" + landMassAnswer);
            radioButton = findViewById(landMassAnswer);
            cod.getLandMassMC().submitAnswer("" + radioButton.getText());
        }
        int populationAnswer = populationMC.getCheckedRadioButtonId();
        if (populationAnswer != -1) {
            Log.i("MC", "" + populationAnswer);
            radioButton = findViewById(populationAnswer);
            cod.getPopulationMC().submitAnswer("" + radioButton.getText());
        }
        startActivity(intent);


    }
    //2131230828
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        int capitalAnswer = capitalMC.getCheckedRadioButtonId();
        MultipleChoice.reset();
        if (capitalAnswer != -1) {
            Log.i("MC", "" + capitalAnswer);
            radioButton = findViewById(capitalAnswer);
            cod.getCapitalMC().submitAnswer("" + radioButton.getText());
        }

        int languageAnswer = languageMC.getCheckedRadioButtonId();
        if (languageAnswer != -1) {
            Log.i("MC", "" + languageAnswer);
            radioButton = findViewById(languageAnswer);
            cod.getLanguageMC().submitAnswer("" + radioButton.getText());
        }

        int continentAnswer = continentMC.getCheckedRadioButtonId();
        if (languageAnswer != -1) {
            Log.i("MC", "" + continentAnswer);
            radioButton = findViewById(continentAnswer);
            cod.getContinentMC().submitAnswer("" + radioButton.getText());
        }


        int landMassAnswer = landMassMC.getCheckedRadioButtonId();
        if (landMassAnswer != -1) {
            Log.i("MC", "" + landMassAnswer);
            radioButton = findViewById(landMassAnswer);
            cod.getLandMassMC().submitAnswer("" + radioButton.getText());
        }
        int populationAnswer = populationMC.getCheckedRadioButtonId();
        if (populationAnswer != -1) {
            Log.i("MC", "" + populationAnswer);
            radioButton = findViewById(populationAnswer);
            cod.getPopulationMC().submitAnswer("" + radioButton.getText());
        }
        MultipleChoice.score();

        startActivity(intent);
    }



}