package com.ciffppiramide.Fornite.clases;

public class Videojuegos {
    private String nombre;
    private String numjugadores;

    private String img;


    public Videojuegos(String nombre, String numjugadores,String img) {
        this.nombre = nombre;
        this.numjugadores = numjugadores;
        this.img = img;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNumjugadores() {
        return numjugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumjugadores(String numjugadores) {
        this.numjugadores = numjugadores;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
