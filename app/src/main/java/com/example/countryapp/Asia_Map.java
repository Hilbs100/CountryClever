package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Asia_Map extends AppCompatActivity {

    Button finish;
    GeographyGame asia = GeographyGame.getMap(3);
    TextView goalCountryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asia);
        finish = (Button) findViewById(R.id.finishAsia);
        GeographyGame.setToast(Asia_Map.this);
        asia.start();
        goalCountryText = (TextView) findViewById(R.id.asiaText);
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        finish.setVisibility(View.INVISIBLE);
    }

    public void toAsiaScore(View v) {
        Intent intent = new Intent(this, asiaresults.class);//fix for results page
        startActivity(intent);
    }

    public void SAback(View v) {
        asia.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

    public void sendChina(View v) {
        asia.pick("China");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "China picked");
    }

    public void sendIndia(View v) {
        asia.pick("India");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "India picked");
    }

    public void sendIndonesia(View v) {
        asia.pick("Indonesia");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Indosenia picked");
    }

    public void sendPakistan(View v) {
        asia.pick("Pakistan");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Pakistan picked");
    }

    public void sendBangladesh(View v) {
        asia.pick("Bangladesh");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Bangladesh picked");
    }

    public void sendJapan(View v) {
        asia.pick("Japan");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Japan picked");
    }

    public void sendPhilippines(View v) {
        asia.pick("Philippines");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Philippines picked");
    }

    public void sendVietnam(View v) {
        asia.pick("Vietnam");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Vietnam picked");
    }

    public void sendTurkey(View v) {
        asia.pick("Turkey");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Turkey picked");
    }

    public void sendIran(View v) {
        asia.pick("Iran");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Iran picked");
    }

    public void sendThailand(View v) {
        asia.pick("Thailand");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Thailand picked");
    }
    public void sendMyanmar(View v) {
        asia.pick("Myanmar");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Myanmar picked");
    }
    public void sendSouthKorea(View v) {
        asia.pick("SouthKorea");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "South Korea picked");
    }
    public void sendIraq(View v) {
        asia.pick("Iraq");
        goalCountryText.setText("Find: " + asia.getGoalCountry());
        if (asia.getGoalCountry().equals("Nothing, you're Finished!")) {
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Iraq picked");
    }

}