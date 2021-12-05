package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.service.Carrito.ICarritoService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Carrito")
public class CarritoController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    ICarritoService iCarritoService;


    @GetMapping
    public String obtenerCliente(){
        return "Carrito obtenido";
    }


    @PostMapping
    public String CrearCliente(){
        return "Cliente Creado";
    }

}
