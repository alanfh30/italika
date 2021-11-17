package com.example.italika.controller;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.italika.models.cotizacionModel;
import com.example.italika.models.interesadoModel;
import com.example.italika.services.cotizacionService;
import com.example.italika.services.interesadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j

public class cotizacionController {


    @Autowired
    cotizacionService cotizacionService;

    @Autowired
    interesadoService interesadoService;


    @GetMapping ("/")
    public String inicio(Model model){

        var cotizaciones = cotizacionService.obtenerCotizacion();    
        model.addAttribute("cotizaciones", cotizaciones);

        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(cotizacionModel cotizacionModel){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(cotizacionModel  cotizacionModel){
        cotizacionService.guardarCotizacion(cotizacionModel);
        return "redirect:/";
    }

    
    @GetMapping("/cotizacion/{id}")
    public String obtenerCotizacion(Model model,cotizacionModel cotizacionModel){
        var cotizacion = cotizacionService.findbyid(cotizacionModel);
        model.addAttribute("cotizacion", cotizacion);
        log.info("usuario que hizo login" + cotizacion);

        return "personas";
    }

    @PostMapping("/cotizacion")
    public cotizacionModel guardarCotizacion(@RequestBody cotizacionModel usuario){
        return this.cotizacionService.guardarCotizacion(usuario);
    }


    @GetMapping("/cotizaciones/{id_usuario}")
    public String cotizacionesById(Model model,cotizacionModel cotizacionModel){
        var cotizaciones =  cotizacionService.encontrarCotizacionesByIds(cotizacionModel);
        model.addAttribute("cotizaciones", cotizaciones);
        log.info("usuario que hizo login" + cotizaciones);

        return "personas";
    }
   
}   
/* Comment from github kghkugjkhkjhkj

/* cambio desde local en rama directa master
 
/* cambio desde local en rama personal

/* cambio rama personal a master usando consola