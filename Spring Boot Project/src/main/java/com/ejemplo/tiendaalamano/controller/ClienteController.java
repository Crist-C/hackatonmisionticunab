package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteCrearDto;
import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteDto;
import com.ejemplo.tiendaalamano.models.Cliente.Request.ClienteRegistrarRequest;
import com.ejemplo.tiendaalamano.models.Cliente.Rest.ClienteRest;
import com.ejemplo.tiendaalamano.service.Cliente.IClienteService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
    

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IClienteService iClienteService; 
    
    @GetMapping
    public String obtenerCliente(){
        return "obtener Cliente";
    }

    @PostMapping
    public ClienteRest crearCliente(@RequestBody ClienteRegistrarRequest clienteRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a clienteCrearDTO
        ClienteCrearDto clienteCrearDto= modelMapper.map(clienteRegistrarRequest, ClienteCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad ClienteDTO
        ClienteDto clienteDto= iClienteService.crearCliente(clienteCrearDto);

        // Mapea desde ClienteDTO al ClienteRestModel (respuesta al Cliente)
        ClienteRest clienteRest= modelMapper.map(clienteDto, ClienteRest.class);

        return clienteRest;
    }

}
