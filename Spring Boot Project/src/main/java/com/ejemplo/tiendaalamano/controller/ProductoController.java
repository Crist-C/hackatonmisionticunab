package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoCrearDto;
import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoDto;
import com.ejemplo.tiendaalamano.models.Producto.Request.ProductoRegistrarRequest;
import com.ejemplo.tiendaalamano.models.Producto.Rest.ProductoRest;
import com.ejemplo.tiendaalamano.service.Producto.IProductoService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IProductoService iProductoService; // Interfaz

    @GetMapping
    public String obtenerProducto() {
        
        return "Obtener Productos";
    }
    
    @PostMapping
    public ProductoRest crearProducto(@RequestBody ProductoRegistrarRequest productoRegistrarRequest){
        
        // Toma los datos desde el formulario y los mapea a productoCrearDTO
        ProductoCrearDto productoCrearDto= modelMapper.map(productoRegistrarRequest, ProductoCrearDto.class);

        // Toma los datos desde DTO y los transforma a la entidad ProductoDTO
        ProductoDto productoDto= iProductoService.crearProducto(productoCrearDto);

        // Mapea desde productoDTO al ProductoRestModel (respuesta al producto)
        ProductoRest productoRest= modelMapper.map(productoDto, ProductoRest.class);

        return productoRest;
    }
    
}
