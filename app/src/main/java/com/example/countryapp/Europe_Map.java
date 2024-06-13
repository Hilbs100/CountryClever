package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Europe_Map extends AppCompatActivity {

    Button finish;
    GeographyGame europe = GeographyGame.getMap(0);
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.europe);
        finish = (Button) findViewById(R.id.finishEurope);
        GeographyGame.setToast(Europe_Map.this);
        europe.start();
        goalCountryText = (TextView) findViewById(R.id.EuropeText);
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        finish.setVisibility(View.INVISIBLE);
    }

    public void toEuropeScore(View v) {
        Intent intent = new Intent(this, EuropeResults.class);
        startActivity(intent);
    }

    public void europeBack(View v) {
        europe.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

    public void sendPortugal(View v){
        europe.pick("Portugal");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Portugal picked");
    }
    public void sendSpain(View v){
        europe.pick("Spain");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Spain picked");
    }
    public void sendFrance(View v){
        europe.pick("France");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "France picked");
    }
    public void sendItaly(View v){
        europe.pick("Italy");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Italy picked");
    }
    public void sendSwiss(View v){
        europe.pick("Switzerland");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Switzerland picked");
    }
    public void sendUK(View v){
        europe.pick("United Kingdom");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "United Kingdom picked");
    }
    public void sendIceland(View v){
        europe.pick("Iceland");
        goalCountryText.setText("Find: " + europe.getGoalCountry());
        if (europe.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Iceland picked");
    }
}
