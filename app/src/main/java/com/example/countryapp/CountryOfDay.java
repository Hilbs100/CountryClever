package com.example.countryapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CountryOfDay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Country_Of_Day);
    }
    private Country countryOfDay;
    public CountryOfDay() {

    }
}
