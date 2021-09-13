package com.constante.tp_3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.constante.tp_3.modelos.Pelicula;

import java.util.ArrayList;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.ViewHolder>{
    private ArrayList<Pelicula> peliculas;
    private Context context;
    private LayoutInflater layoutInflater;

    public PeliculasAdapter(ArrayList<Pelicula> peliculas, Context context, LayoutInflater layoutInflater) {
        this.peliculas = peliculas;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    public PeliculasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_pelicula,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvTitulo.setText(peliculas.get(position).getTitulo());
        holder.tvReseña.setText(peliculas.get(position).getReseña());
        holder.imagen.setImageResource(peliculas.get(position).getFoto());
        holder.detalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ActivityDetalles.class);
                intent.putExtra("Director",peliculas.get(position).getDirector());
                intent.putExtra("Actores",peliculas.get(position).getActores());
                intent.putExtra("Imagen",peliculas.get(position).getFoto());
                intent.putExtra("Reseña",peliculas.get(position).getReseña());
                intent.putExtra("Titulo",peliculas.get(position).getTitulo());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitulo, tvReseña;
        private ImageView imagen;
        private Button detalles;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.TvTitulo);
            tvReseña = itemView.findViewById(R.id.TvReseña);
            imagen = itemView.findViewById(R.id.IvFoto);
            detalles = itemView.findViewById(R.id.BtDetalles);
        }
    }
}
