package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Africa_Map extends AppCompatActivity {

    GeographyGame africa = GeographyGame.getMap(2);
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.africa);
        africa.start();
        goalCountryText = (TextView) findViewById(R.id.AfricaText);
        goalCountryText.setText("Find: " + africa.getGoalCountry());
    }

    public void africaBack(View v) {
        africa.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

    public void sendROC(View v) {
        africa.pick("DR Congo");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        Log.i("Geography Game", "DRC picked");
    }


}
