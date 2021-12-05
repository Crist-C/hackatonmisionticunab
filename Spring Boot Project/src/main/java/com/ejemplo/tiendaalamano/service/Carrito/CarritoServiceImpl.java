package com.ejemplo.tiendaalamano.service.Carrito;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.entities.Carrito;
import com.ejemplo.tiendaalamano.models.Carrito.Dtos.CarritoCrearDto;
import com.ejemplo.tiendaalamano.models.Carrito.Dtos.CarritoDto;
import com.ejemplo.tiendaalamano.repository.ICarritoRepository;

@Service
public class CarritoServiceImpl implements ICarritoService {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private ICarritoRepository CarritoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Carrito> findAll() {
		return (List<Carrito>) CarritoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Carrito> findById(Long id) {
		return CarritoRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito save(Carrito Carrito) {
		return CarritoRepository.save(Carrito);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		CarritoRepository.deleteById(id);
	}

	@Override
	public CarritoDto crearCarrito(CarritoCrearDto carritoCrearDto) {
		
		Carrito carritoEntityDto= modelMapper.map(carritoCrearDto, Carrito.class);
        //carritoEntityDto.setEncryptedPassword("encryptedPassword");
        //carritoEntityDto.setCarritoId("carritoId");

        Carrito carritoEntitySave=CarritoRepository.save(carritoEntityDto);

        CarritoDto carritoDto= modelMapper.map(carritoEntitySave, CarritoDto.class);

        return carritoDto;
	}

	@Override
	public List<Carrito> login(String username, String password) {
		return null;
	}

}
