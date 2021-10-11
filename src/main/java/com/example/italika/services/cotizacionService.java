package com.example.italika.services;
import java.util.ArrayList;

import com.example.italika.models.cotizacionModel;
import com.example.italika.repositories.cotizacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class cotizacionService {
    @Autowired
    cotizacionRepository cotizacionRepository;

    public ArrayList<cotizacionModel> obtenerCotizacion(){
        return (ArrayList<cotizacionModel>) cotizacionRepository.findAll();
    }

    public cotizacionModel guardarCotizacion(cotizacionModel usuario){
        return cotizacionRepository.save(usuario);
    }
}
