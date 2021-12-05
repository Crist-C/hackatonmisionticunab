package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.Usuario.UsuarioCrearDto;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioDto;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioRegistrarRequest;
import com.ejemplo.tiendaalamano.models.Usuario.UsuarioRest;
import com.ejemplo.tiendaalamano.service.Carrito.CarritoServiceImpl;
import com.ejemplo.tiendaalamano.service.Usuario.IUsuarioService;
import com.ejemplo.tiendaalamano.service.Usuario.UsuarioServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController{

    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IUsuarioService iUsuarioService; // Interfaz
    
    CarritoServiceImpl usuarioServiceiImpl;

    @GetMapping
    public String obtenerUsuario() {
        
        return "Obtener Usuarios";
    }
    
    @PostMapping
    public UsuarioRest crearUsuario(@RequestBody UsuarioRegistrarRequest usuarioRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a usuarioCrearDTO
        UsuarioCrearDto usuarioCrearDto= modelMapper.map(usuarioRegistrarRequest, UsuarioCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad UsuarioDTO
        UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);

        // Mapea desde usuarioDTO al UsuarioRestModel (respuesta al usuario)
        UsuarioRest usuarioRest= modelMapper.map(usuarioDto, UsuarioRest.class);

        return usuarioRest;
    }
    

}
