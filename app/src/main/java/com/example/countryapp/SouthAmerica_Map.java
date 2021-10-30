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

    public void sendBrazil(View v){
        southAmerica.pick("Brazil");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Brazil picked");
    }

    public void sendArgentina(View v){
        southAmerica.pick("Argentina");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Argentina picked");
    }

    public void sendChile(View v){
        southAmerica.pick("Chile");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Chile picked");
    }

    public void sendPeru(View v){
        southAmerica.pick("Peru");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Peru picked");
    }

    public void sendBolivia(View v){
        southAmerica.pick("Bolivia");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Bolivia picked");
    }

    public void sendUruguay(View v){
        southAmerica.pick("Uruguay");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Uruguay picked");
    }

    public void sendParaguay(View v){
        southAmerica.pick("Paraguay");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Paraguay picked");
    }

    public void sendEcuador(View v){
        southAmerica.pick("Ecuador");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Ecuador picked");
    }

    public void sendColombia(View v){
        southAmerica.pick("Colombia");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Colombia picked");
    }

    public void sendVenezuela(View v){
        southAmerica.pick("Venezuela");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Venezuela picked");
    }

    public void sendGuyana(View v){
        southAmerica.pick("Guyana");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Guyana picked");
    }

    public void sendSuriname(View v){
        southAmerica.pick("Suriname");
        goalCountryText.setText("Find: " + southAmerica.getGoalCountry());
        Log.i("Geography Game", "Suriname picked");
    }
}


