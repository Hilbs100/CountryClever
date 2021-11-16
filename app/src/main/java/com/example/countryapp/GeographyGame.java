package com.example.countryapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class GeographyGame {
    private static Context context;
    private static StyleableToast currentToast;
    private static ArrayList<GeographyGame> maps = new ArrayList<GeographyGame>();
    private ArrayList<String> countries = new ArrayList<String>();
    private ArrayList<String> usedCountries = new ArrayList<String>();
    private ArrayList<String> unusedCountries = new ArrayList<String>();
    private int score = 0;
    private String goalCountry;
    public GeographyGame() {
        countries = new ArrayList<String>();
    }
    public void addCountry(String name) {
        countries.add(name);
    }
    public void setUnusedCountries() {
        for (int i = 0; i < countries.size(); i++) {
            unusedCountries.add(countries.get(i));
        }
    }
    public void start() {
        reset();
        findNewCountry();
    }
    private void findNewCountry() {
        int rand = (int)(Math.random() * unusedCountries.size());
        if (unusedCountries.size() > 0) {
            goalCountry = unusedCountries.get(rand);
            usedCountries.add(unusedCountries.remove(rand));
        }
        else {
            goalCountry = "Nothing, you're Finished!";
        }
        Log.i("Country Selected", goalCountry);
    }
    public static void setToast(Context context) {
        GeographyGame.context = context;
        currentToast = StyleableToast.makeText(context, "", Toast.LENGTH_SHORT, R.style.toast);
    }

    public String getGoalCountry() {
        return goalCountry;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("NewApi")
    public boolean pick(String country) {
        if (country.equals(goalCountry)) {
            Log.i("Geography Game", "true");
            if(currentToast.getRootView().isShown())
                currentToast.setTooltipText("correct");
            else {
                currentToast.makeText(context, "correct", Toast.LENGTH_SHORT, R.style.toast).show();
            }
            score++;
            findNewCountry();
            return true;
        }
        if (!goalCountry.equals("Nothing, you're Finished!")) {
            WrongAnswers WA = new WrongAnswers(country, goalCountry);
        }
        Log.i("Geography Game", "false");
        findNewCountry();
        if(currentToast.getRootView().isShown())
            currentToast.setTooltipText("incorrect");
        else {
            currentToast.makeText(context, "incorrect", Toast.LENGTH_SHORT, R.style.toast).show();
        }        return false;

    }
    public void reset() {
        WrongAnswers.resetAnswers();
        while(usedCountries.size() > 0) {
            usedCountries.remove(0);
        }
        while(unusedCountries.size() > 0) {
            unusedCountries.remove(0);
        }
        for (int i = 0; i < countries.size(); i++) {
            unusedCountries.add(countries.get(i));
        }
        score = 0;

    }
    public double returnScore() {
        return ((score + 0.0)/(countries.size())) * 100;
    }
    public String returnFormattedScore() {
        DecimalFormat fmt = new DecimalFormat("#.##");
        return fmt.format(returnScore());
    }

    public static void addMap(GeographyGame map) {
        maps.add(map);
    }
    public static GeographyGame getMap(int i ) {
        return maps.get(i);
    }


}
