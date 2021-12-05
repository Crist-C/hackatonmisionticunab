package com.ejemplo.tiendaalamano.service.Cliente;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.entities.Cliente;
import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteCrearDto;
import com.ejemplo.tiendaalamano.models.Cliente.Dtos.ClienteDto;

public interface IClienteService {
	public List<Cliente> findAll();
	public Optional<Cliente> findById(Long id);
	public List<Cliente> login(String username, String password);
	public Cliente save(Cliente Cliente);
	public void deleteById(Long id);
	public ClienteDto crearCliente(ClienteCrearDto clienteCrearDto);
	
	
}
