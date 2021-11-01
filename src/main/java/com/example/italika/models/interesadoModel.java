package com.example.italika.models;

import java.sql.Date;

import javax.persistence.*;

import org.springframework.web.servlet.FlashMapManager;
import java.util.List;


@Entity
@Table(name="interesado")


public class interesadoModel {
    
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    private String nombre;
    private String numeroCelular;
    private String correo;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


    public String getnumeroCelular() {
        return numeroCelular;
    }

    public void setVersion(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<cotizacionModel> getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(cotizacionModel cotizaciones) {
        this.cotizaciones = (List<cotizacionModel>) cotizaciones;
    }


}


//se cambia algo del codigo para hacer una pull request