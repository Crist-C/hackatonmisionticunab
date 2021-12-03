package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Usuario;
import com.ejemplo.tiendaalamano.service.UsuarioService;
import com.ejemplo.tiendaalamano.service.UsuarioServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController{
    
    UsuarioServiceImpl usuarioServiceiImpl;

    @GetMapping
    public String obtenerUsuario() {
        
        return "Obtener Usuario";
    }
    
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioServiceiImpl.save(usuario);
    }

/* 
    @PostMapping
    public Usuario actualizarContraseña(@RequestBody Usuario usuario) {
        return usuarioServiceiImpl.save(usuario); 
    }
    */
    
//pruba github

}
