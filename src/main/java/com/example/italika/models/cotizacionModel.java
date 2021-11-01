package com.example.italika.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="cotizacion")


public class cotizacionModel implements Serializable  {

    private static final long serialVersion = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    
    private String modelo;
    private String version;
    private Date fecha;
    private Integer costoDesglosado;
    private Integer costoTotal;
    private Integer montoEnganche;
    
    @OneToOne
    @JoinColumn(name = "id")
    private interesadoModel interesado;



    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getcostoDesglosado() {
        return costoDesglosado;
    }

    public void setcostoDesglosado(Integer costoDesglosado) {
        this.costoDesglosado = costoDesglosado;
    }

    public Integer getcostoTotal() {
        return costoTotal;
    }

    public void setcostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Integer getmontoEnganche() {
        return montoEnganche;
    }

    public void setmontoEnganche(Integer montoEnganche) {
        this.montoEnganche = montoEnganche;
    }


}


