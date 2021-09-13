package com.constante.tp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetalles extends AppCompatActivity {
    private TextView titulo, reseña, director, actores;
    private ImageView foto;
    private Button volver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        inicializarVista();
    }

    public void inicializarVista(){
        titulo = findViewById(R.id.TvTitulo2);
        reseña = findViewById(R.id.TvReseña2);
        director = findViewById(R.id.TvDirector);
        actores = findViewById(R.id.TvActores);
        foto = findViewById(R.id.IvFoto2);
        volver = findViewById(R.id.BTVolver);
        titulo.setText(getIntent().getStringExtra("Titulo"));
        reseña.setText(getIntent().getStringExtra("Reseña"));
        director.setText(getIntent().getStringExtra("Director"));
        actores.setText(getIntent().getStringExtra("Actores"));
        int id = getResources().getIdentifier(getIntent().getStringExtra("Imagen"), "drawable", getPackageName());
        foto.setImageResource(id);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDetalles.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}