package com.example.italika.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cotizacion")


public class cotizacionModel implements Serializable  {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private Integer costoDesglosado;
    private Integer costoTotal;
    private Date fecha;

    private String modelo;
    private Integer montoEnganche;

    private String version;
    private Long id_usuario;
 

}

//cambio para prueba de local


