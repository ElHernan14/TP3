package com.constante.tp_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.constante.tp_3.modelos.Pelicula;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPeliculas;
    private PeliculasAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeliculas=findViewById(R.id.RVPeliculas);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        rvPeliculas.setLayoutManager(gridLayoutManager);
        adapter=new PeliculasAdapter(obtenerPeliculas(),this,getLayoutInflater());
        rvPeliculas.setAdapter(adapter);
    }

    private ArrayList<Pelicula> obtenerPeliculas(){
        ArrayList<Pelicula> lista = new ArrayList<>();
        lista.add(new Pelicula("Ejército de los muertos",R.drawable.ehe,"Director: Zack Snyder","Con Dave Bautista de protagonista junto a Ella Purnell, Ana de la Reguera, Theo Rossi y Tig Notaro","Casi veinte años después de ‘Amanecer de los muertos’, Zack Snyder vuelve a los zombies con esta película de Netflix, donde se mezclan las claves del género y la 'heist movie' para crear una aventura de acción a la que le falta pulso y le sobran minutos."));
        lista.add(new Pelicula("Snake Eyes: El origen",R.drawable.s,"Director: Henry Goldin","Actores: Úrsula Corberó,Andrew Koji","Este spin-off de 'G.I. Joe' se centra en la historia de los orígenes de Snake Eyes (Henry Golding), el ninja silencioso siempre vestido de negro y del que no se conoce el rostro, y cómo intenta convertirse en miembro del clan Arashikage."));
        lista.add(new Pelicula("Mortal Kombat ",R.drawable.mlk,"Director: Simon McQuoid","Actores: Katy Perry, Mark Walbherg, Timmy Turner","El famoso videojuego vuelve a la gran pantalla por tercera vez, y las tortas y la violencia están aseguradas. No en vano ha sido calificado como no recomendada para menores de 18 años, y con razón: la película de Simon McQuoid no se corta un pelo a la hora de mostrar la violencia llevada al extremo con sus luchas trepidantes."));
        lista.add(new Pelicula("Godzilla vs Kong",R.drawable.kk,"Director: Adam Wingard","Actores: Terminator, Lionel Messi, Carlos Pedron","Hace años que se venía gestando uno de los enfrentamientos más épicos de todos los tiempos, entre dos de los monstruos más icónicos de la historia del cine. Godzilla, que viene directamente desde 'Godzilla: Rey de los monstruos', y King Kong, que venía de 'Kong: Skull Island', se enfrentan en una batalla épica en esta película dirigida por Adam Wingard, todo un éxito de taquilla que ha revitalizando un 'Monsterverse' que estaba ya agonizando."));
        lista.add(new Pelicula(" Nuevo orden",R.drawable.asdasd,"Director: Michel Franco","Actores: Antonio Bandera, Michael Page, Lylly Elliot, Carla Esparza","Gran Premio del Jurado en la pasada edición del Festival de Venecia, esta nueva película del mexicano Michel Franco vuelve a llevar a la pantalla el mensaje de 'Eat the rich' en una distopía brutal y violenta sobre una rebelión contra las clases privilegiadas. "));
        return lista;
    }
}