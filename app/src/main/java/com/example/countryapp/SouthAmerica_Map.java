package com.example.countryapp;

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
        GeographyGame.getMap(2).start();
        //goalCountryText = (TextView) findViewById(R.id.AfricaText);
        //goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
    }




}

}
