package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SouthAmerica_Map extends AppCompatActivity {
    GeographyGame southAmerica = GeographyGame.getMap(4);
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.south_america);
        southAmerica.start();
        goalCountryText = (TextView) findViewById(R.id.southAmericaText);
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
    }
    public void SAback(View v) {
        southAmerica.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }




}


