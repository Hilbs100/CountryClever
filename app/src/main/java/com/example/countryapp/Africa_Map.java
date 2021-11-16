package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Africa_Map extends AppCompatActivity {

    Toast africaToast;
    GeographyGame africa = GeographyGame.getMap(2);
    Button finish;
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.africa);
        finish = (Button) findViewById(R.id.africaFinish);
        africaToast = new Toast(this);
        africaToast.makeText(Africa_Map.this, "hello", Toast.LENGTH_SHORT);
        GeographyGame.setToast(Africa_Map.this);
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
    public void goToAfricaResults(View v) {
        Intent intent = new Intent(this, AfricaResults.class);
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
    public void sendLibya(View v) {
        africa.pick("Libya");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Libya picked");
    }
    public void sendEgypt(View v) {
        africa.pick("Egypt");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Egypt picked");
    }
    public void sendSudan(View v) {
        africa.pick("Sudan");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Sudan picked");
    }
    public void sendSouthSudan(View v) {
        africa.pick("South Sudan");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "South Sudan picked");
    }
    public void sendEthiopia(View v) {
        africa.pick("Ethiopia");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Ethiopia picked");
    }
    public void sendSomalia(View v) {
        africa.pick("Somalia");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Somalia picked");
    }
    public void sendKenya(View v) {
        africa.pick("Kenya");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Kenya picked");
    }
    public void sendUganda(View v) {
        africa.pick("Uganda");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Uganda picked");
    }
    public void sendMozambique(View v) {
        africa.pick("Mozambique");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Mozambique picked");
    }
    public void sendZimbabwe(View v) {
        africa.pick("Zimbabwe");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Zimbabwe picked");
    }
    public void sendZambia(View v) {
        africa.pick("Zambia");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Zambia picked");
    }
    public void sendBotswana(View v) {
        africa.pick("Botswana");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Botswana picked");
    }
    public void sendSouthAfrica(View v) {
        africa.pick("South Africa");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "South Africa picked");
    }
    public void sendNamibia(View v) {
        africa.pick("Namibia");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Namibia picked");
    }
    public void sendAngola(View v) {
        africa.pick("Angola");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Angola picked");
    }
    public void sendGabon(View v) {
        africa.pick("Gabon");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Gabon picked");
    }
    public void sendCameroon(View v) {
        africa.pick("Cameroon");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Cameroon picked");
    }
    public void sendCAR(View v) {
        africa.pick("Central African Republic");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Central African Republic picked");
    }
    public void sendChad(View v) {
        africa.pick("Chad");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Chad picked");
    }
    public void sendNiger(View v) {
        africa.pick("Niger");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Niger picked");
    }
    public void sendNigeria(View v) {
        africa.pick("Nigeria");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Nigeria picked");
    }
    public void sendGhana(View v) {
        africa.pick("Ghana");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Ghana picked");
    }
    public void sendCoteD(View v) {
        africa.pick(    "Côte d'Ivoire");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Côte d'Ivoire picked");
    }
    public void sendBurkF(View v) {
        africa.pick("Burkina Faso");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Burkina Faso picked");
    }
    public void sendGuinea(View v) {
        africa.pick("Guinea");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Guinea picked");
    }
    public void sendSenegal(View v) {
        africa.pick("Senegal");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Senegal picked");
    }
    public void sendWSahara(View v) {
        africa.pick("Western Sahara");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Western Sahara picked");
    }
    public void sendMorocco(View v) {
        africa.pick("Morocco");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Morocco picked");
    }
    public void sendTunisia(View v) {
        africa.pick("Tunisia");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Tunisia picked");
    }
    public void sendEritrea(View v) {
        africa.pick("Eritrea");
        goalCountryText.setText("Find: " + africa.getGoalCountry());
        if (africa.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Eritrea picked");
    }








}
