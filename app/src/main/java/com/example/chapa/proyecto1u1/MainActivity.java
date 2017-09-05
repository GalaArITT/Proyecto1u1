package com.example.chapa.proyecto1u1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nombre[]={"Pizza","Burger","sushi"};
    private int imagenes[]={
            R.drawable.pizza,
            R.drawable.burger,
            R.drawable.sushi    };


    private ListView lista;
    private CustomAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView)findViewById(R.id.lista);
        adaptador= new CustomAdapter(this,nombre,imagenes);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,detalleAct.class);
                intent.putExtra("parametro", i+"");
                startActivity(intent);
            }
        });
    }



}
