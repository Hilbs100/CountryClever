package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//import the time thingy here



public class CountryOfDay extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("COD", "Opened");
        Country cod = Country.setCountryOfTheDay();
        Log.i("COD", cod.getCountryName());
        setContentView(R.layout.activity_country_of_day);
        TextView header = (TextView) findViewById(R.id.header);
        String headerText = cod.getCountryName();
        header.setText("" + headerText);
        TextView body = (TextView) findViewById(R.id.body);
        String bodyText = cod.getCodBody();
        body.setText("" + bodyText);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
