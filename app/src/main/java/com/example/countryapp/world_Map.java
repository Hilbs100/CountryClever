package com.example.countryapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.countryapp.R.id.africa;
import static com.example.countryapp.R.id.asia;
import static com.example.countryapp.R.id.europe;
import static com.example.countryapp.R.id.north_america;
import static com.example.countryapp.R.id.south_america;
import static com.example.countryapp.R.id.world_map_game;

public class world_Map extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world__map);
    }
    @SuppressLint("ResourceType")
    public void goToNA(View v) {
        setContentView(north_america);
    }
    @SuppressLint("ResourceType")
    public void goToSA(View v) {
        setContentView(south_america);
    }
    @SuppressLint("ResourceType")
    public void goToOceania(View v) {
        setContentView(R.id.oceania);
    }
    @SuppressLint("ResourceType")
    public void goToAsia(View v) {
        setContentView(asia);
    }
    @SuppressLint("ResourceType")
    public void goToAfrica(View v) {
        setContentView(africa);
    }
    @SuppressLint("ResourceType")
    public void goToEurope(View v) {
        setContentView(europe);
    }
    @SuppressLint("ResourceType")
    public void goToWorld(View v) {
        setContentView(world_map_game);
    }
}