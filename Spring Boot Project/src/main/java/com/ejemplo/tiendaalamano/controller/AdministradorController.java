package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorCrearDto;
import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorDto;
import com.ejemplo.tiendaalamano.models.Administrador.Request.AdministradorRegistrarRequest;
import com.ejemplo.tiendaalamano.models.Administrador.Rest.AdministradorRest;
import com.ejemplo.tiendaalamano.service.Administrador.IAdministradorService;
import com.ejemplo.tiendaalamano.service.Carrito.CarritoServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Administrador")
public class AdministradorController {
    
    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IAdministradorService iAdministradorService; // Interfaz
    
    CarritoServiceImpl administradorServiceiImpl;

    @GetMapping
    public String obtenerAdministrador() {
        
        return "Obtener Administradores";
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
