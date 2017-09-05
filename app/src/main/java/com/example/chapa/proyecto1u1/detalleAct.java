package com.example.chapa.proyecto1u1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detalleAct extends AppCompatActivity {


    private TextView titulo,descipcion;
    private ImageView imagen1;

    private String nombre[]={"Pizza","Burger","sushi"};
    private String descrip[]={"Una pizza que consiste de dos tortillas de harina",
    "una hamburguesa de las mejores de la ciudad",
    "Comida japonesa adoptada en mexico"};
    private int imagenes[]={
            R.drawable.pizza,
            R.drawable.burger,
            R.drawable.sushi
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titulo=(TextView)findViewById(R.id.nombrePlatillo);
        descipcion=(TextView)findViewById(R.id.descripcion);
        imagen1=(ImageView)findViewById(R.id.imagen1);

        int parametro=Integer.parseInt(getIntent().getExtras().getString("parametro"));
        titulo.setText(nombre[parametro]);
        descipcion.setText(descrip[parametro]);
        imagen1.setImageResource(imagenes[parametro]);
        //Toast.makeText(detalleAct.this,parametro+"",Toast.LENGTH_LONG).show();

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
 */
    }

}
