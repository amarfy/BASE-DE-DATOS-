package com.ciffppiramide.Fornite.clases;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Tarjeta_Credito")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "nombre_de_usuario", nullable = false)
    private String nombre_de_usuario;

    @Column(name = "email_del_usuario", nullable = false)
    private String email_del_usuario;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne(mappedBy = "Usuario" )
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Tarjeta_Credito tarjetaCredito;

    public String getNombre_de_usuario() {
        return nombre_de_usuario;
    }

    public void setNombre_de_usuario(String nombre_de_usuario) {
        this.nombre_de_usuario = nombre_de_usuario;
    }

    public String getEmail_del_usuario() {
        return email_del_usuario;
    }

    public void setEmail_del_usuario(String email_del_usuario) {
        this.email_del_usuario = email_del_usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
