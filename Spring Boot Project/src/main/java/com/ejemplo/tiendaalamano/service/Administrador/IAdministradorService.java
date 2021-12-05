package com.ejemplo.tiendaalamano.service.Administrador;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Administrador;
import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorCrearDto;
import com.ejemplo.tiendaalamano.models.Administrador.Dtos.AdministradorDto;

public interface IAdministradorService {
	public List<Administrador> findAll();
	public Optional<Administrador> findById(Long id);
	public List<Administrador> login(String username, String password);
	public Administrador save(Administrador Administrador);
	public void deleteById(Long id);
	public AdministradorDto crearAdministrador(AdministradorCrearDto administradorCrearDto);
	
	
}
