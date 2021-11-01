package com.example.italika.repositories;


import com.example.italika.models.interesadoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface interesadoRepository  extends CrudRepository<interesadoModel, Long> {
    
}
