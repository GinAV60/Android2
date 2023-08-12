package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vengaamipueblo3.adaptadores.RestauranteAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeRestaurantes;
import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerRestaurantes = findViewById(R.id.listadinamicarestaurantes);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearlista();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adaptador);
    }

    public void crearlista() {
        listaRestaurantes.add(new MoldeRestaurantes("250000", "Restaurante la nueva comida", R.drawable.restasurante4jpg, ""));
        listaRestaurantes.add(new MoldeRestaurantes("350000", "Restaurante nuevos platos", R.drawable.restaurantexx3, "Restaurante Sabores del Pueblo:\n" +
                "Disfruta de la auténtica cocina local en un ambiente acogedor. Nuestros platos tradicionales resaltan los sabores únicos de la región, utilizando ingredientes frescos de chefs locales."));
        listaRestaurantes.add(new MoldeRestaurantes("450000", "Restaurante come bueno", R.drawable.restaurantexx5, "Eleva tus sentidos en La Terraza, donde la gastronomía se fusiona con vistas panorámicas. Saborea exquisitos platos gourmet preparados por chefs apasionados. Nuestra terraza al aire libre es perfecta para cenas románticas y ocasiones especiales"));
        listaRestaurantes.add(new MoldeRestaurantes("550000", "Restaurante el sabor de santa fe", R.drawable.restaurantexx2, "Sumérgete en un oasis culinario de sabores mediterráneos en el coralatillo, brindándote una experiencia única."));
        listaRestaurantes.add(new MoldeRestaurantes("650000", "Restaurante el silletero", R.drawable.restaurantexx1, "Deliciosos platillos ambiente espectacular, si quieres un nuevo ambiente, una experiencia diferente "));

    }
}