package com.ciffppiramide.Fornite.clases;

import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta")
public class Tarjeta_Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mes", nullable = false)
    private String mes;

    @Column(name = "caducidad", nullable = false)
    private int caducidad;

    @Column(name = "cvv", nullable = false)
    private int cvv;

    @Column(name = "num_tarjeta", nullable = false)
    private int num_tarjeta;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_usuario",referencedColumnName = "id")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }


    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }
}
