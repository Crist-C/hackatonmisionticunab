package com.ejemplo.tiendaalamano.service.Carrito;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Carrito;
import com.ejemplo.tiendaalamano.models.Carrito.Dtos.CarritoCrearDto;
import com.ejemplo.tiendaalamano.models.Carrito.Dtos.CarritoDto;

public interface ICarritoService {
	public List<Carrito> findAll();
	public Optional<Carrito> findById(Long id);
	public List<Carrito> login(String username, String password);
	public Carrito save(Carrito Carrito);
	public void deleteById(Long id);
	public CarritoDto crearCarrito(CarritoCrearDto carritoCrearDto);
	
	
}
