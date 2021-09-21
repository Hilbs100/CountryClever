package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizGrade extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView score = (TextView) findViewById(R.id.grade);
        score.setText("" + MultipleChoice.score() + "%");
        if (MultipleChoice.score() == 100.0)
            score.setTextColor(Color.GREEN);
        else if(MultipleChoice.score() == 0.0) {
            score.setTextColor(Color.RED);
        }
        else
            score.setTextColor(Color.YELLOW);
        setContentView(R.layout.quiz_results);
    }
}

