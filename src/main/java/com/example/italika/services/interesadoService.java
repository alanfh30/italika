package com.example.italika.services;
import java.util.ArrayList;
import java.util.Optional;

import com.example.italika.models.cotizacionModel;
import com.example.italika.models.interesadoModel;
import com.example.italika.repositories.interesadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class interesadoService {

    @Autowired
    interesadoRepository interesadoRepository;

    public ArrayList<interesadoModel> obtenerInteresados(){
        return (ArrayList<interesadoModel>) interesadoRepository.findAll();
    }

    public interesadoModel guardarInteresado(interesadoModel usuario){
        return interesadoRepository.save(usuario);
    }


 
    @Transactional(readOnly = true)
    public ArrayList<String> obtenerCotizacion(interesadoModel interesado) {
        
        var cotizaciones = new ArrayList<String>();
        
        for (cotizacionModel cotizacion: interesado.getCotizaciones()){
            cotizaciones.add(cotizacion.getModelo());
        }

        return cotizaciones;
    }



}
