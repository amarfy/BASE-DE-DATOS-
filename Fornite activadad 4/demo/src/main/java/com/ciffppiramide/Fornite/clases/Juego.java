package com.ciffppiramide.Fornite.clases;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_de_creacion")
    private LocalDate fecha_de_creacion;
    @Column(name = "juego_creado")
    private String juego_creado;
    @Column(name = "email_del_creador")
    private String email_del_creador;
    @Column(name = "comentario")
    private String comentario;

    public Juego(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDate fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public String getJuego_creado() {
        return juego_creado;
    }

    public void setJuego_creado(String juego_creado) {
        this.juego_creado = juego_creado;
    }

    public String getEmail_del_creador() {
        return email_del_creador;
    }

    public void setEmail_del_creador(String email_del_creador) {
        this.email_del_creador = email_del_creador;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Juego{" +
                ", fecha_de_creacion=" + fecha_de_creacion +
                ", juego_creado='" + juego_creado + '\'' +
                ", email_del_creador='" + email_del_creador + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
