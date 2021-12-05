package com.ejemplo.tiendaalamano.service.Domiciliario;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Domiciliario;
import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioCrearDto;
import com.ejemplo.tiendaalamano.models.Domiciliario.Dtos.DomiciliarioDto;

public interface IDomiciliarioService {
	public List<Domiciliario> findAll();
	public Optional<Domiciliario> findById(Long id);
	public List<Domiciliario> login(String username, String password);
	public Domiciliario save(Domiciliario Domiciliario);
	public void deleteById(Long id);
	public DomiciliarioDto crearDomiciliario(DomiciliarioCrearDto domiciliarioCrearDto);
	
	
}
