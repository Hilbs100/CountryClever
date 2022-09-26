package com.example.countryapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EuropeResults extends AppCompatActivity {

    GeographyGame europe = GeographyGame.getMap(0);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geo_game_results);
        TextView results = (TextView) findViewById(R.id.geoGameScore);
        results.setText("" + europe.returnFormattedScore() + "%");
        if (europe.returnScore() >= 85.0)
            results.setTextColor(Color.GREEN);
        else if(europe.returnScore() <= 30.0) {
            results.setTextColor(Color.RED);
        }
        else
            results.setTextColor(Color.YELLOW);

        TextView answers = (TextView) findViewById(R.id.incAnswers);
        answers.setText(WrongAnswers.getAnswers());

    }

    public void returnHome(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}