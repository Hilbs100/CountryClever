package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class world_Map extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world__map);

    }

    public void openSearchGlobe(){
        Intent intent = new Intent(this, search_globe.class);
        startActivity(intent);
    }
}