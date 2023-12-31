package com.example.vengaamipueblo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.vengaamipueblo3.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo3.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);
        recyclerHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearlista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }
    public void crearlista(){
        listaHoteles.add(new MoldeHotel("250000",R.drawable.xxhotel4,"Hotel el san martin campestre"));
        listaHoteles.add(new MoldeHotel("350000",R.drawable.xxhotel3,"Hotel el nuevo hotel de tu vida"));
        listaHoteles.add(new MoldeHotel("450000",R.drawable.xxhotel2,"Hotel nuevo hotel de santa fe"));
        listaHoteles.add(new MoldeHotel("550000",R.drawable.hotel5,"Hotel el hotelsito de Samta fé"));
        listaHoteles.add(new MoldeHotel("650000",R.drawable.xxhotel1,"Hotel somos el mejor hotel los otros son copia"));

    }
}

