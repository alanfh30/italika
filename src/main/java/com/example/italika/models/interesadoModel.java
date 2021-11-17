package com.example.italika.models;
import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="interesado")


public class interesadoModel implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_usuario;
    
    private String nombre;
    private String numeroCelular;
    private String correo;


    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<cotizacionModel> cotizaciones;
   

}


//se cambia algo del codigo para hacer una pull request