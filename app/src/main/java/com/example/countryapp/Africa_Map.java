package com.example.countryapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Africa_Map extends AppCompatActivity {

    GeographyGame africa = GeographyGame.getMap(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.africa);
        GeographyGame.getMap(2).start();
    }

    public void sendROC(View v) {
        africa.pick("DR Congo");
        Log.i("Geography Game", "DRC picked");
    }


}
