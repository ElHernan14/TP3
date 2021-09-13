package com.constante.tp_3.modelos;

public class Pelicula {
    private String titulo;
    private String reseña;
    private int foto;
    private String actores;
    private String director;

    public Pelicula(String titulo, int foto, String director,String actores, String reseña) {
        this.titulo = titulo;
        this.reseña = reseña;
        this.foto = foto;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
