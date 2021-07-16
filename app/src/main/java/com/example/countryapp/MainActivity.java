package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    boolean repeat = false;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!repeat) {
            DoTheStuff.run();
            repeat = true;
        }
/*        Button cod = (Button) findViewById(R.id.country_of_day_button);
        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = new Date().getYear() + 1900;
                int month = new Date().getMonth() + 1;
                int day = new Date().getDate();
                CountriesOfTheDay.setDate(year, month, day);
                CountriesOfTheDay.getCOD();
                Log.i("COD", "Date: " + month + "/" + day + "/" + year);
                setContentView(R.layout.activity_country_of_day);
            }
        });*/

        Button begin = (Button) findViewById(R.id.beginButton);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_world__map);
                Log.i("Starter", "clicked");
            }
        });
    }
    public void openCOD(View v) {
        Intent intent = new Intent(this, CountryOfDay.class);
        int year = new Date().getYear() + 1900;
        int month = new Date().getMonth() + 1;
        int day = new Date().getDate();
        CountriesOfTheDay.setDate(year, month, day);
        CountriesOfTheDay.getCOD();
        Log.i("COD", "Date: " + month + "/" + day + "/" + year);
        startActivity(intent);
    }




        //button for world map
    //opens world map when clicked
    public void openWorldMap(){
        Intent intent = new Intent(this, world_Map.class);
        GeographyGame.getMap(0).start();
        startActivity(intent);
    }

    //commenting this out because it is causing an illegal state exception error
    /*public void openCountryOfDay(View v){
        Intent intent = new Intent(this, CountryOfDay.class);
        startActivity(intent);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    // BUTTONSSSSSS
    public void sendCanada(View v) {
        GeographyGame.getMap(1).pick("Canada");
        Log.i("Canada", "Clicked");
    }


    @SuppressLint("ResourceType")
    public void goToNA(View v) {
        setContentView(R.layout.north_america);
    }
    @SuppressLint("ResourceType")
    public void goToSA(View v) {
        setContentView(R.layout.south_america);
    }
    @SuppressLint("ResourceType")
    public void goToOceania(View v) {
        setContentView(R.layout.oceania);
    }
    @SuppressLint("ResourceType")
    public void goToAsia(View v) {
        setContentView(R.layout.asia);
    }
    @SuppressLint("ResourceType")
    public void goToAfrica(View v) {
        setContentView(R.layout.africa);
    }
    @SuppressLint("ResourceType")
    public void goToEurope(View v) {
        setContentView(R.layout.europe);
    }
    public void goToWorld(View v) {
        Log.i("GeoGame Home", "To World Map");
        setContentView(R.layout.world_map_game);
    }


}
