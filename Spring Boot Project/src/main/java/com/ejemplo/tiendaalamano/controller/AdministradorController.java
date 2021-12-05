package com.ejemplo.tiendaalamano.controller;

public class AdministradorController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IAdministradorService iAdministradorService; // Interfaz
    
    CarritoServiceImpl administradorServiceiImpl;

    @GetMapping
    public String obtenerAdministrador() {
        
        return "Obtener Administradors";
    }
    
    @PostMapping
    public AdministradorRest crearAdministrador(@RequestBody AdministradorRegistrarRequest administradorRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a administradorCrearDTO
        AdministradorCrearDto administradorCrearDto= modelMapper.map(administradorRegistrarRequest, AdministradorCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad AdministradorDTO
        AdministradorDto administradorDto= iAdministradorService.crearAdministrador(administradorCrearDto);

        // Mapea desde administradorDTO al AdministradorRestModel (respuesta al administrador)
        AdministradorRest administradorRest= modelMapper.map(administradorDto, AdministradorRest.class);

        return administradorRest;
    }

}
