package com.example.italika.services;
import java.util.ArrayList;
import java.util.Optional;

import com.example.italika.models.cotizacionModel;
import com.example.italika.models.interesadoModel;
import com.example.italika.repositories.interesadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public ArrayList<String> obtenerCotizaciones(interesadoModel interesado) {
        
        interesadoModel usuario = interesadoRepository.findById(interesado.getId()).orElse(null);
    
    var cotizaciones = new ArrayList<String>();
        
    for (cotizacionModel rol: usuario.getCotizaciones()){
        cotizaciones.add(rol.getModelo());
    }
    
    return cotizaciones;
    }



}
