package com.ejemplo.tiendaalamano.service.Producto;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Producto;
import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoCrearDto;
import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoDto;

public interface IProductoService {
	public List<Producto> findAll();
	public Optional<Producto> findById(Long id);
	public List<Producto> login(String username, String password);
	public Producto save(Producto Producto);
	public void deleteById(Long id);
	public ProductoDto crearProducto(ProductoCrearDto productoCrearDto);
	
	
}
