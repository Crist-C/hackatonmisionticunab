package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioCrearDto;
import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioDto;
import com.ejemplo.tiendaalamano.models.Domiciliario.Request.DomiciliarioRegistrarRequest;
import com.ejemplo.tiendaalamano.models.Domiciliario.Rest.DomiciliarioRest;
import com.ejemplo.tiendaalamano.service.Domiciliario.IDomiciliarioService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Domiciliario")
public class DomiciliarioController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IDomiciliarioService iDomiciliarioService; // Interfaz

    @GetMapping
    public String obtenerDomiciliario() {
        
        return "Obtener Domiciliarios";
    }
    
    @PostMapping
    public DomiciliarioRest crearDomiciliario(@RequestBody DomiciliarioRegistrarRequest domiciliarioRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a domiciliarioCrearDTO
        DomiciliarioCrearDto domiciliarioCrearDto= modelMapper.map(domiciliarioRegistrarRequest, DomiciliarioCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad DomiciliarioDTO
        DomiciliarioDto domiciliarioDto= iDomiciliarioService.crearDomiciliario(domiciliarioCrearDto);

        // Mapea desde domiciliarioDTO al DomiciliarioRestModel (respuesta al domiciliario)
        DomiciliarioRest domiciliarioRest= modelMapper.map(domiciliarioDto, DomiciliarioRest.class);

        return domiciliarioRest;
    }


}
