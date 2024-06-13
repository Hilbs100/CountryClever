package com.example.countryapp;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NA_Map extends AppCompatActivity {

    Button finish;
    GeographyGame northAmerica = GeographyGame.getMap(1);
    TextView goalCountryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_america);
        finish = (Button) findViewById(R.id.finishNA);
        GeographyGame.setToast(NA_Map.this);
        northAmerica.start();
        goalCountryText = (TextView) findViewById(R.id.northAmericaText);
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        finish.setVisibility(View.INVISIBLE);
    }

    public void toNAScore(View v) {
        Intent intent = new Intent(this, NAresults.class);
        startActivity(intent);
    }

    public void NAback(View v) {
        northAmerica.reset();
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

    public void sendCanada(View v){
        northAmerica.pick("Canada");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Canada picked");
    }

    public void sendUSA(View v){
        northAmerica.pick("United States of America");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "USA picked");
    }

    public void sendMexico(View v){
        northAmerica.pick("Mexico");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Mexico picked");
    }

    public void sendAntiguaBarbuda(View v){
        northAmerica.pick("Antigua and Barbuda");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Antigua and Barbuda picked");
    }//NOT ON MAP

    public void sendBahamas(View v){
        northAmerica.pick("Bahamas");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Bahamas picked");
    }

    public void sendBarbados(View v){
        northAmerica.pick("Barbados");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Barbados picked");
    }//NOT ON MAP

    public void sendBelize(View v){
        northAmerica.pick("Belize");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Belize picked");
    }

    public void sendCostaRica(View v){
        northAmerica.pick("Costa Rica");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Costa Rica picked");
    }

    public void sendCuba(View v){
        northAmerica.pick("Cuba");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Cuba picked");
    }

    public void sendDominica(View v){
        northAmerica.pick("Dominica");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Dominica picked");
    }//NOT ON MAP

    public void sendDominicanRepublic(View v){
        northAmerica.pick("Dominican Republic");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Dominican Republic picked");
    }
    public void sendElSalvador(View v){
        northAmerica.pick("El Salvador");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "El Salvador picked");
    }

    public void sendGrenada(View v){
        northAmerica.pick("Grenada");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Grenada picked");
    }//NOT ON MAP

    public void sendGuatemala(View v){
        northAmerica.pick("Guatemala");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Guatemala picked");
    }

    public void sendHaiti(View v){
        northAmerica.pick("Haiti");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Haiti picked");
    }

    public void sendHonduras(View v){
        northAmerica.pick("Honduras");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Honduras picked");
    }

    public void sendJamaica(View v){
        northAmerica.pick("Jamaica");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Jamaica picked");
    }

    public void sendNicaragua(View v){
        northAmerica.pick("Nicaragua");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Nicaragua picked");
    }

    public void sendPanama(View v){
        northAmerica.pick("Panama");
        goalCountryText.setText("Find: " + northAmerica.getGoalCountry());
        if (northAmerica.getGoalCountry().equals("Nothing, you're Finished!")){
            finish.setVisibility(View.VISIBLE);
        }
        Log.i("Geography Game", "Panama picked");
    }

    /*These countries and the ones marked above as "NOT ON MAP"
    are not listed on the map because they are too small
    to be clicked. When zoom is working, they will be added.
    */
    //
    // Saint Kitts and Nevis
    // Saint Lucia
    // Saint Vincent and the Grenadines
    // Trinidad and Tobago

    //Until zoom is up, we will have to delete these some the DoTheStuff.java file.

}
