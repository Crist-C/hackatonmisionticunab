package com.ejemplo.tiendaalamano.controller;

public class DomiciliarioController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IDomiciliarioService iDomiciliarioService; // Interfaz
    
    CarritoServiceImpl domiciliarioServiceiImpl;

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
