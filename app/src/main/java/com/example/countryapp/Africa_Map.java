package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Africa_Map extends AppCompatActivity {

    GeographyGame africa = GeographyGame.getMap(2);
    Button finish;
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.africa);
        finish = (Button) findViewById(R.id.africaFinish);
        africa.start();
        goalCountryText = (TextView) findViewById(R.id.AfricaText);
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        finish.setVisibility(View.INVISIBLE);
    }

    public void africaBack(View v) {
        africa.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

    public void sendROC(View v) {
        africa.pick("DR Congo");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "DRC picked");
    }
    public void sendCongo(View v) {
        africa.pick("Congo");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Congo picked");
    }
    public void sendTanz(View v) {
        africa.pick("Tanzania");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Tanzania picked");
    }
    public void sendMaur(View v) {
        africa.pick("Mauritania");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Mauritania picked");
    }
    public void sendMali(View v) {
        africa.pick("Mali");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Mali picked");
    }
    public void sendAlgeria(View v) {
        africa.pick("Algeria");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Algeria picked");
    }





}
