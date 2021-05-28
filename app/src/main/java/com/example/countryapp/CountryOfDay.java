package com.example.countryapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.*;
//import the time thingy here



public class CountryOfDay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CountryOfDay cod = new CountryOfDay();
        setContentView(R.layout.activity_country_of_day);
        final TextView header = (TextView) findViewById(R.id.header);
        String headerText = cod.getHeader();
        header.setText(headerText);
        final TextView body = (TextView) findViewById(R.id.body);
        String bodyText = cod.getBody();
        body.setText(bodyText);
    }

    public void goBack(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public CountryOfDay() {
        //this will need to be changed so that it updates every day, keeping track of the day using Time.java
        Country.setCountryOfTheDay();
    }
    public String getHeader() {return Country.getCountryOfTheDay().getCountryName();}
    public String getBody() {
        Country countryOfDay = Country.getCountryOfTheDay();
        String body = "";
        body += "Capital: ";
        body += countryOfDay.getCapital();
        body += "\nPopulation: ";
        body += countryOfDay.getPopulation();
        body += "\nLandmass: ";
        body += countryOfDay.getLandMass();
        body += "\nLanguage: ";
        body += countryOfDay.getLanguage();
        body += "\nFun Fact: ";
        body += countryOfDay.getFunFact1();
        return body;
    }

}
