package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.vengaamipueblo3.adaptadores.SitioAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeSitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<MoldeSitios> listaSitios=new ArrayList<>();
    RecyclerView recyclerSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);
        recyclerSitios = findViewById(R.id.listadinamicasitios);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearlista();
        SitioAdaptador adaptador=new SitioAdaptador(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }
    public void crearlista(){
        listaSitios.add(new MoldeSitios("20000",R.drawable.kanaloaparqueacuatico,"Kanola parque acuatico"));
        listaSitios.add(new MoldeSitios("Gratis",R.drawable.cascada,"Cascada El Chorro:"));
        listaSitios.add(new MoldeSitios("Gratis",R.drawable.puentedeloccidente,"Puente del occidente"));
        listaSitios.add(new MoldeSitios("Gratis",R.drawable.templosreligiosos,"Templos Religiosos"));
        listaSitios.add(new MoldeSitios("Gratis",R.drawable.plazasimonbolivar,"Plaza simon bolivar"));

    }

}
