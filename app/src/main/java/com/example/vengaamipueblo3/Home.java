package com.example.vengaamipueblo3;

import static com.example.vengaamipueblo3.R.id.botonacercade;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {
    Button botonhoteles;
    Button botonrestaurantes;
    Button botonSitiosTuristicos;

    Button botonAcercade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonhoteles=findViewById(R.id.botonhoteles);
        botonrestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos=findViewById(R.id.botonturismo);
        botonAcercade=findViewById(botonacercade);

        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Estamos haciendo click en hoteles", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });
        botonrestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Estamos haciendo click en restaurantes", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
        });

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Estamos haciendo click en Sitios turisticos ", Toast.LENGTH_SHORT).show();
                Intent intent3=new Intent(Home.this, Sitios.class);
                startActivity(intent3);
            }
        });

      botonAcercade.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(Home.this, "Estamos haciendo click en Acerca de:  ", Toast.LENGTH_SHORT).show();
            Intent intent3=new Intent(Home.this, Acercade.class);
            startActivity(intent3);
        }
        });
    }




    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int itemSeleccionado = item.getItemId();

        if (itemSeleccionado == R.id.opcion1) {
            this.lenguageChange("es");
            Intent intentSpanish = new Intent(Home.this, Home.class);
            startActivity(intentSpanish);
        } else if (itemSeleccionado == R.id.opcion2) {
            this.lenguageChange("en");
            Intent intentEnglish = new Intent(Home.this, Home.class);
            startActivity(intentEnglish);
        } else if (itemSeleccionado == R.id.opcion3) {
            this.lenguageChange("eo");
            Intent intentEsperanto = new Intent(Home.this, Home.class);
            startActivity(intentEsperanto);
        } else if (itemSeleccionado == R.id.opcion4) {
            Intent aboutUs = new Intent(Home.this, Acercade.class);
            startActivity(aboutUs);
            Toast.makeText(this, "Accionaste acerca de:", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void lenguageChange(String lenguaje){
        Locale locale = new Locale(lenguaje);

        Resources resources = getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);

        getBaseContext().getResources().updateConfiguration(new Configuration(),getBaseContext().getResources().getDisplayMetrics());
    }
}