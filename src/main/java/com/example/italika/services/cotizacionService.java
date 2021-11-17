package com.example.italika.services;
import java.util.ArrayList;

import com.example.italika.models.cotizacionModel;
import com.example.italika.repositories.cotizacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


@Service
public class cotizacionService {
    @Autowired
    cotizacionRepository cotizacionRepository;


    @Transactional(readOnly = true)
    public ArrayList<cotizacionModel> obtenerCotizacion(){
        return (ArrayList<cotizacionModel>) cotizacionRepository.findAll();
    }

    @Transactional(readOnly = true)
    public cotizacionModel guardarCotizacion(cotizacionModel usuario){
        return cotizacionRepository.save(usuario);
    }

    @Transactional(readOnly = true)
    public  ArrayList<cotizacionModel> encontrarCotizacionesByIds(cotizacionModel cotizacionModel){
        return cotizacionRepository.findCotizaciones(cotizacionModel.getId_usuario());
    }

    @Transactional(readOnly = true)
    public cotizacionModel findbyid(cotizacionModel cotizacionModel){
        return cotizacionRepository.findById(cotizacionModel.getId()).orElse(null);
    }

}
