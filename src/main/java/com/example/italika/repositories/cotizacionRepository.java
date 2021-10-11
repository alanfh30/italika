package com.example.italika.repositories;

import com.example.italika.models.cotizacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface cotizacionRepository extends CrudRepository<cotizacionModel, Long>{

    

}