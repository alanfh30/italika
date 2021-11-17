package com.example.italika.repositories;

import com.example.italika.models.cotizacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.ArrayList;



@Repository

public interface cotizacionRepository extends CrudRepository<cotizacionModel, Long>{
    @Query("select c from  cotizacionModel c where c.id_usuario = :id_usuario")
    ArrayList<cotizacionModel> findCotizaciones(@Param("id_usuario") Long id_usuario);
}