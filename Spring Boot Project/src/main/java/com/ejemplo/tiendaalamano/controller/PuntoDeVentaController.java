package com.ejemplo.tiendaalamano.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/PuntoVenta")
public class PuntoDeVentaController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IPuntoDeVentaService iPuntoDeVentaService; // Interfaz
    
    CarritoServiceImpl puntoDeVentaServiceiImpl;

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
