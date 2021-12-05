package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaCrearDto;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Dtos.PuntoDeVentaDto;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Request.PuntoDeVentaRegistrarRequest;
import com.ejemplo.tiendaalamano.models.PuntoDeVenta.Rest.PuntoDeVentaRest;
import com.ejemplo.tiendaalamano.service.PuntoDeVenta.IPuntoDeVentaService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PuntoVenta")
public class PuntoDeVentaController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IPuntoDeVentaService iPuntoDeVentaService; // Interfaz

    @GetMapping
    public String obtenerPuntoDeVenta() {
        
        return "Obtener PuntoDeVentas";
    }
    
    @PostMapping
    public PuntoDeVentaRest crearPuntoDeVenta(@RequestBody PuntoDeVentaRegistrarRequest puntoDeVentaRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a puntoDeVentaCrearDTO
        PuntoDeVentaCrearDto puntoDeVentaCrearDto= modelMapper.map(puntoDeVentaRegistrarRequest, PuntoDeVentaCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad PuntoDeVentaDTO
        PuntoDeVentaDto puntoDeVentaDto= iPuntoDeVentaService.crearPuntoDeVenta(puntoDeVentaCrearDto);

        // Mapea desde puntoDeVentaDTO al PuntoDeVentaRestModel (respuesta al puntoDeVenta)
        PuntoDeVentaRest puntoDeVentaRest= modelMapper.map(puntoDeVentaDto, PuntoDeVentaRest.class);

        return puntoDeVentaRest;
    }

}
