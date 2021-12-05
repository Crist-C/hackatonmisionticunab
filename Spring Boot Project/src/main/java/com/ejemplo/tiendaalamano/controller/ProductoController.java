package com.ejemplo.tiendaalamano.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    ModelMapper modelMapper;    //Mapeo de datos

    @Autowired
    IProductoService iProductoService; // Interfaz
    
    CarritoServiceImpl productoServiceiImpl;

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
