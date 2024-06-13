package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class world_Map extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world__map);
    }
    public void returnHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void goToNA(View v) {
        Intent intent = new Intent(this, NA_Map.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void goToSA(View v) {

        Intent intent = new Intent(this, SouthAmerica_Map.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void goToOceania(View v) {
        setContentView(R.layout.oceania);
    }
    @SuppressLint("ResourceType")
    public void goToAsia(View v) {
        Intent intent = new Intent(this, Asia_Map.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void goToAfrica(View v) {
        Intent intent = new Intent(this, Africa_Map.class);
        startActivity(intent);
    }
    @SuppressLint("ResourceType")
    public void goToEurope(View v) {
        Intent intent = new Intent(this, Europe_Map.class);
        startActivity(intent);
    }
    public void goToWorld(View v) {
        Log.i("GeoGame Home", "To World Map");
        setContentView(R.layout.world_map_game);
    }


}