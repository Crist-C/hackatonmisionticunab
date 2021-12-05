package com.ejemplo.tiendaalamano.service.Producto;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Producto;
import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoCrearDto;
import com.ejemplo.tiendaalamano.models.Producto.Dtos.ProductoDto;
import com.ejemplo.tiendaalamano.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private IProductoRepository ProductoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) ProductoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id) {
		return ProductoRepository.findById(id);
	}

	@Override
	@Transactional
	public Producto save(Producto Producto) {
		return ProductoRepository.save(Producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		ProductoRepository.deleteById(id);
	}

	@Override
	public ProductoDto crearProducto(ProductoCrearDto productoCrearDto) {
		
		Producto productoEntityDto= modelMapper.map(productoCrearDto, Producto.class);
        //productoEntityDto.setEncryptedPassword("encryptedPassword");
        //productoEntityDto.setProductoId("productoId");

        Producto productoEntitySave=ProductoRepository.save(productoEntityDto);

        ProductoDto productoDto= modelMapper.map(productoEntitySave, ProductoDto.class);

        return productoDto;
	}

	@Override
	public List<Producto> login(String username, String password) {
		return null;
	}



}
