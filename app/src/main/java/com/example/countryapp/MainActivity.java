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
    static int repeat = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (repeat == 0) {
            DoTheStuff.run();
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

    }
    public void openCOD(View v) {
        Intent intent = new Intent(this, CountryOfDay.class);
        repeat = 1;
        int year = new Date().getYear();
        int month = new Date().getMonth() + 1;
        int day = new Date().getDate();
        Country.setDate(year, month, day);
        Country.setCountryOfTheDay();
        Log.i("COD", "Date: " + month + "/" + day + "/" + year);
        startActivity(intent);
    }

    public void toGeoGame(View v) {
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
        Log.i("Starter", "clicked");
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
    public void returnHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
