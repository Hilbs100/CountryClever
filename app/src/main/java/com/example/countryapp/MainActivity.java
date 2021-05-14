package com.example.countryapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private Button worldMap;
    // Constructors and other things
    {

        //Someone might wanna look over these and add the
        //maybe countries (like Taiwan)

        //Europe Countries added
        {

            GeographyGame Europe = new GeographyGame();
            Europe.addCountry("Russia");
            Europe.addCountry("Germany");
            Europe.addCountry("United Kingdom");
            Europe.addCountry("France");
            Europe.addCountry("Italy");
            Europe.addCountry("Spain");
            Europe.addCountry("Ukraine");
            Europe.addCountry("Poland");
            Europe.addCountry("Romania");
            Europe.addCountry("Netherlands");
            Europe.addCountry("Belgium");
            Europe.addCountry("Czech Republic");
            Europe.addCountry("Greece");
            Europe.addCountry("Portugal");
            Europe.addCountry("Sweden");
            Europe.addCountry("Hungary");
            Europe.addCountry("Belarus");
            Europe.addCountry("Austria");
            Europe.addCountry("Serbia");
            Europe.addCountry("Switzerland");
            Europe.addCountry("Bulgaria");
            Europe.addCountry("Denmark");
            Europe.addCountry("Finland");
            Europe.addCountry("Slovakia");
            Europe.addCountry("Norway");
            Europe.addCountry("Ireland");
            Europe.addCountry("Croatia");
            Europe.addCountry("Moldova");
            Europe.addCountry("Bosnia and Herzegovina");
            Europe.addCountry("Albania");
            Europe.addCountry("Lithuania");
            Europe.addCountry("North Macedonia");
            Europe.addCountry("Slovenia");
            Europe.addCountry("Latvia");
            Europe.addCountry("Estonia");
            Europe.addCountry("Montenegro");
            Europe.addCountry("Luxembourg");
            Europe.addCountry("Malta");
            Europe.addCountry("Iceland");
            Europe.addCountry("Andorra");
            Europe.addCountry("Monaco");
            Europe.addCountry("Liechtenstein");
            Europe.addCountry("San Marino");
            Europe.addCountry("The Vatican City");
            Europe.setUnusedCountries();
            GeographyGame.addMap(Europe);
        }


        //North American Countries added
        {

            GeographyGame northAmerica = new GeographyGame();
            northAmerica.addCountry("Canada");
            northAmerica.addCountry("United States of America");
            northAmerica.addCountry("Mexico");
            northAmerica.addCountry("Antigua and Barbuda");
            northAmerica.addCountry("Bahamas");
            northAmerica.addCountry("Barbados");
            northAmerica.addCountry("Belize");
            northAmerica.addCountry("Costa Rica");
            northAmerica.addCountry("Cuba");
            northAmerica.addCountry("Dominica");
            northAmerica.addCountry("Dominican Republic");
            northAmerica.addCountry("El Salvador");
            northAmerica.addCountry("Grenada");
            northAmerica.addCountry("Guatemala");
            northAmerica.addCountry("Haiti");
            northAmerica.addCountry("Honduras");
            northAmerica.addCountry("Jamaica");
            northAmerica.addCountry("Nicaragua");
            northAmerica.addCountry("Panama");
            northAmerica.addCountry("Saint Kitts and Nevis");
            northAmerica.addCountry("Saint Lucia");
            northAmerica.addCountry("Saint Vincent and the Grenadines");
            northAmerica.addCountry("Trinidad and Tobago");
            northAmerica.setUnusedCountries();
            GeographyGame.addMap(northAmerica);
        }


        //African Countries added
        {
            GeographyGame Africa = new GeographyGame();
            Africa.addCountry("Nigeria");
            Africa.addCountry("Ethiopia");
            Africa.addCountry("Egypt");
            Africa.addCountry("DR Congo");
            Africa.addCountry("Tanzania");
            Africa.addCountry("South Africa");
            Africa.addCountry("Kenya");
            Africa.addCountry("Uganda");
            Africa.addCountry("Algeria");
            Africa.addCountry("Sudan");
            Africa.addCountry("Morocco");
            Africa.addCountry("Angola");
            Africa.addCountry("Mozambique");
            Africa.addCountry("Ghana");
            Africa.addCountry("Madagascar");
            Africa.addCountry("Cameroon");
            Africa.addCountry("Côte d'Ivoire");
            Africa.addCountry("Niger");
            Africa.addCountry("Burkina Faso");
            Africa.addCountry("Mali");
            Africa.addCountry("Malawi");
            Africa.addCountry("Zambia");
            Africa.addCountry("Senegal");
            Africa.addCountry("Chad");
            Africa.addCountry("Somalia");
            Africa.addCountry("Zimbabwe");
            Africa.addCountry("Guinea");
            Africa.addCountry("Rwanda");
            Africa.addCountry("Benin");
            Africa.addCountry("Burundi");
            Africa.addCountry("Tunisia");
            Africa.addCountry("South Sudan");
            Africa.addCountry("Togo");
            Africa.addCountry("Sierra Leone");
            Africa.addCountry("Libya");
            Africa.addCountry("Congo");
            Africa.addCountry("Liberia");
            Africa.addCountry("Central African Republic");
            Africa.addCountry("Mauritania");
            Africa.addCountry("Eritrea");
            Africa.addCountry("Namibia");
            Africa.addCountry("Gambia");
            Africa.addCountry("Botswana");
            Africa.addCountry("Gabon");
            Africa.addCountry("Lesotho");
            Africa.addCountry("Guinea-Bissau");
            Africa.addCountry("Equatorial Guinea");
            Africa.addCountry("Mauritius");
            Africa.addCountry("Eswatini");
            Africa.addCountry("Djibouti");
            Africa.addCountry("Comoros");
            Africa.addCountry("Cabo Verde");
            Africa.addCountry("Sao Tome & Principe");
            Africa.addCountry("Seychelles");
            Africa.setUnusedCountries();
            GeographyGame.addMap(Africa);
        }


        //Asian Counties added
        {

            GeographyGame Asia = new GeographyGame();
            Asia.addCountry("China");
            Asia.addCountry("India");
            Asia.addCountry("Indonesia");
            Asia.addCountry("Pakistan");
            Asia.addCountry("Bangladesh");
            Asia.addCountry("Japan");
            Asia.addCountry("Philippines");
            Asia.addCountry("Vietnam");
            Asia.addCountry("Turkey");
            Asia.addCountry("Iran");
            Asia.addCountry("Thailand");
            Asia.addCountry("Myanmar");
            Asia.addCountry("South Korea");
            Asia.addCountry("Iraq");
            Asia.addCountry("Afghanistan");
            Asia.addCountry("Saudi Arabia");
            Asia.addCountry("Uzbekistan");
            Asia.addCountry("Malaysia");
            Asia.addCountry("Yemen");
            Asia.addCountry("Nepal");
            Asia.addCountry("North Korea");
            Asia.addCountry("Sri Lanka");
            Asia.addCountry("Kazakhstan");
            Asia.addCountry("Syria");
            Asia.addCountry("Cambodia");
            Asia.addCountry("Azerbaijan");
            Asia.addCountry("United Arab Emirates");
            Asia.addCountry("Tajikistan");
            Asia.addCountry("Israel");
            Asia.addCountry("Laos");
            Asia.addCountry("Lebanon");
            Asia.addCountry("Kyrgyzstan");
            Asia.addCountry("Turkmenistan");
            Asia.addCountry("Singapore");
            Asia.addCountry("Oman");
            Asia.addCountry("State of Palestine");
            Asia.addCountry("Kuwait");
            Asia.addCountry("Georgia");
            Asia.addCountry("Mongolia");
            Asia.addCountry("Armenia");
            Asia.addCountry("Qatar");
            Asia.addCountry("Bahrain");
            Asia.addCountry("Timor-Leste");
            Asia.addCountry("Cyprus");
            Asia.addCountry("Bhutan");
            Asia.addCountry("Maldives");
            Asia.addCountry("Brunei");
            Asia.setUnusedCountries();
            GeographyGame.addMap(Asia);
        }


        //South American added
        {
            GeographyGame southAmerica = new GeographyGame();
            southAmerica.addCountry("Argentina");
            southAmerica.addCountry("Bolivia");
            southAmerica.addCountry("Brazil");
            southAmerica.addCountry("Chile");
            southAmerica.addCountry("Colombia");
            southAmerica.addCountry("Ecuador");
            southAmerica.addCountry("Guyana");
            southAmerica.addCountry("Paraguay");
            southAmerica.addCountry("Peru");
            southAmerica.addCountry("Suriname");
            southAmerica.addCountry("Uruguay");
            southAmerica.addCountry("Venezuela");
            southAmerica.setUnusedCountries();
            GeographyGame.addMap(southAmerica);
        }


        //Oceania added
        {
            GeographyGame Oceania = new GeographyGame();
            Oceania.addCountry("Australia");
            Oceania.addCountry("Papua New Guinea");
            Oceania.addCountry("New Zealand");
            Oceania.addCountry("Fiji");
            Oceania.addCountry("Solomon Islands");
            Oceania.addCountry("Vanuatu");
            Oceania.addCountry("New Caledonia");
            Oceania.addCountry("Kiribati");
            Oceania.addCountry("Samoa");
            Oceania.addCountry("Micronesia");
            Oceania.addCountry("Tonga");
            Oceania.addCountry("Marshall Islands");
            Oceania.addCountry("Palau");
            Oceania.addCountry("Tuvalu");
            Oceania.addCountry("Nauru");
            Oceania.setUnusedCountries();
            GeographyGame.addMap(Oceania);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button begin = (Button) findViewById(R.id.beginButton);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.world_map_game );
                Log.i("Starter", "clicked");
            }
        });

        //button for world map
        worldMap = findViewById(R.id.world_map_button);
        worldMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorldMap();
            }
        });


    }

    public void openWorldMap(){
        Intent intent = new Intent(this, world_Map.class);
        startActivity(intent);
    }

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
    public void sendCanada(View v) {
        GeographyGame.getMap(0).pick("Canada");
        Log.i("Canada", "Clicked");
    }
}
