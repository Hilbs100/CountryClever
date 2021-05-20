package com.example.countryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class world_Map extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world__map);

        button = (Button) findViewById(R.id.open_the_map);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSearchGlobe();
            }
        });

    }

    public void openSearchGlobe(){
        Intent intent = new Intent(this, search_globe.class);
        startActivity(intent);
    }
}