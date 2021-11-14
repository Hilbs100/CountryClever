package com.example.countryapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class NA_Map extends AppCompatActivity {

    GeographyGame northAmerica = GeographyGame.getMap(1);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_america);
    }
}
