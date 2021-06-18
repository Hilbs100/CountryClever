package com.example.countryapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.*;
//import the time thingy here



public class CountryOfDay extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Country cod = Country.setCountryOfTheDay();
        final TextView header = (TextView) findViewById(R.id.header);
        String headerText = cod.getCodHeader();
        header.setText(headerText);
        final TextView body = (TextView) findViewById(R.id.body);
        String bodyText = cod.getCodBody();
        body.setText("Hello");
        setContentView(R.layout.activity_country_of_day);
    }



}
