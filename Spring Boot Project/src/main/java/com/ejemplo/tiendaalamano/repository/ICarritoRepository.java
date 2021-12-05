package com.ejemplo.tiendaalamano.repository;

import com.ejemplo.tiendaalamano.entities.Carrito;

import org.springframework.data.repository.CrudRepository;

public interface ICarritoRepository extends CrudRepository <Carrito, Long> {
    
}
